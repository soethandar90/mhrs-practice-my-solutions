package mhrs.round3;

public class MatchPatternClass {
    public static void main(String[] args) {
        System.out.println(matchPattern(new int[]{1, 1, 1, 2, 2, 1, 1, 3}, new int[]{1, 2, 1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1}, new int[]{1}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2, 3}, new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 2}, new int[]{1, 2, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3}, new int[]{1, 3}));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1} , new int[]{1, 2} ));
        System.out.println(matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3} , new int[]{1, 2}));
        System.out.println(matchPattern(new int[]{1, 1, 10, 4, 4, 3}, new int[]{1, 4, 3}));

    }

    static int matchPattern(int[] a, int[] pattern) {
        if (a.length < 1 || pattern.length < 1 || pattern[0] != a[0] || pattern[pattern.length - 1] != a[a.length - 1]) {
            return 0;
        }
        int cnt = 1;
        int i = 0;
        int start = 0;
        while (i < pattern.length) {
            for (int j = start; j < a.length - 1; j++) {
                if (pattern[i] != a[j]) {
                    cnt++;
                    start = j;
                    break;
                }
            }
            if(cnt<=i){
                return 0;
            }
            i++;
        }
        if (cnt != pattern.length) {
            return 0;
        }
        return 1;
    }
}

