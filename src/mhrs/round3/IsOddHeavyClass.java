package mhrs.round3;

public class IsOddHeavyClass {
    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8})); //1
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10})); //0
        System.out.println(isOddHeavy(new int[]{1})); //1
        System.out.println(isOddHeavy(new int[]{2})); //0
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1})); //1
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11})); //1
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11})); //0
    }

    static int isOddHeavy(int[] a) {
        int maxEven = 0;
        int minOdd = 0;
        for (int i : a) {
            if (i % 2 == 0) {
                if (maxEven == 0) {
                    maxEven = i;
                } else {
                    if (i > maxEven) {
                        maxEven = i;
                    }
                }
            } else {
                if (minOdd == 0) {
                    minOdd = i;
                } else {
                    if (i < minOdd) {
                        minOdd = i;
                    }
                }
            }
        }
        if (minOdd == 0) {
            return 0;
        } else {
            if (minOdd < maxEven) {
                return 0;
            }
        }
        return 1;
    }
}
