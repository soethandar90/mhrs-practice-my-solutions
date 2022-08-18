package mhrs.round1;

public class isDivisibleClass {
    public static void main(String[] args) {
//        int[] inArray = new int[]{3, 3, 6, 36};
//        int divisor= 3;//1
//        int[] inArray = new int[]{4};
//        int divisor= 2;//1
//        int[] inArray = new int[]{3, 4, 3, 6, 36};
//        int divisor= 3;//0
//        int[] inArray = new int[]{6, 12, 24, 36};
//        int divisor= 12;//0
        int[] inArray = new int[]{};
        int divisor= 12;//1
        System.out.println(isDivisible(inArray, divisor));
    }

    static int isDivisible(int[] a, int divisor) {
        int rt = 0;
        int dividedCount = 0;
        if (a == null || a.length == 0) {
            rt = 1;
        } else {
            for (int i : a) {
                if (i % divisor == 0) {
                    dividedCount += 1;
                }
            }
            if (dividedCount == a.length) {
                rt = 1;
            } else {
                rt = 0;
            }
        }
        return rt;
    }
}
