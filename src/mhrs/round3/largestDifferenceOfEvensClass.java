package mhrs.round3;

public class largestDifferenceOfEvensClass {
    public static void main(String[] args) {
        System.out.println(largestDifferenceOfEvens(new int[]{1, 3, 5, 9}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 18, 5, 7, 33}));
        System.out.println(largestDifferenceOfEvens(new int[]{2, 2, 2, 2}));
        System.out.println(largestDifferenceOfEvens(new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}));
    }

    static int largestDifferenceOfEvens(int[] a) {
        int minEven = a[0];
        int maxEven = a[0];
        int evenCnt = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                if(evenCnt==0){
                    minEven = i;
                    maxEven = i;
                }
                evenCnt += 1;
                if (i < minEven) {
                    minEven = i;
                }
                if (i > maxEven) {
                    maxEven = i;
                }
            }
        }
        if (evenCnt > 1) {
            return maxEven - minEven;
        }
        return -1;
    }
}
