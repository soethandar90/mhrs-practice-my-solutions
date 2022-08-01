package mhrs.round3;

public class IsVanillaClass {
    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111})); //1
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111})); //0
        System.out.println(isVanilla(new int[]{1})); //1
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125})); //0
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999})); //1
        System.out.println(isVanilla(new int[]{}));//1
    }

    static int isVanilla(int[] a) {
        if (a.length > 0) {
            int initNum = Math.abs(a[0]);
            while (!(initNum > 0 && initNum < 10)) {
                initNum /= 10;
            }
            for (int i : a) {
                while (Math.abs(i) > 0) {
                    if (Math.abs(i) % 10 != initNum) {
                        return 0;
                    }
                    i /= 10;
                }
            }
        }
        return 1;
    }
}
