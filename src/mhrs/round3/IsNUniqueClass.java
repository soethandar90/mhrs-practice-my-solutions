package mhrs.round3;

public class IsNUniqueClass {
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{2, 7, 3, 4}, 5));
        System.out.println(isNUnique(new int[]{2, 3, 3, 7}, 5));
        System.out.println("-----------------");
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{}, 999));
    }

    static int isNUnique(int[] a, int n) {
        if(a.length<2){
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n) {
                    if (cnt == 1) {
                        return 0;
                    } else {
                        cnt++;
                    }
                }
            }
        }
        if(cnt!=1){
            return 0;
        }
        return 1;
    }

}
