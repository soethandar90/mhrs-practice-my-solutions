package mhrs.round3;

public class IsMinMaxDisJointClass {
    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }

    static int isMinMaxDisjoint(int[] a) {
        if(a.length<1){
            return 0;
        }
        int min = a[0];
        int minIndex = 0;
        int minCnt = 1;
        int max = a[a.length-1];
        int maxIndex = 0;
        int maxCnt = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max && maxCnt > 0) {
                maxCnt++;
            } else if (a[i] > max) {
                max = a[i];
                maxIndex = i;
                maxCnt = 1;
            }
            if (a[i] == min && minCnt > 0) {
                minCnt++;
            } else if (a[i] < min) {
                min = a[i];
                minIndex = i;
                minCnt = 1;
            }
        }
        if (Math.abs(minIndex - maxIndex) == 1 || minCnt > 1 || maxCnt > 1 || max == min) {
             return 0;
        }
        //System.out.println(min);
        //System.out.println("Min Cnt"+minCnt);
        //System.out.println("Min Index"+minIndex);
        //System.out.println(max);
        //System.out.println("Max Cnt"+maxCnt);
        //System.out.println("Max Index"+maxIndex);
        return 1;
    }
}
