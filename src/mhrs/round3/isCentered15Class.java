package mhrs.round3;

public class isCentered15Class {
    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9})); //1
        System.out.println(isCentered15(new int[]{2, 10, 4, 1, 6, 9})); //0
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6})); //0
        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 1})); //1
        System.out.println(isCentered15(new int[]{9, 15, 6})); //1
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1})); //0
        System.out.println(isCentered15(new int[]{1, 1, 15 - 1, -1}));//1
    }

    static int isCentered15(int[] a) {
        int start = a.length / 2;
        int end = start;
        if (a.length % 2 == 0) {
            start -= 1;
        }

        int j = 0;
        while (end + j < a.length) {
            int sum = 0;
            for (int i = start - j; i <= end + j; i++) {
                sum += a[i];
            }
            if (sum == 15) {
                return 1;
            }
            j++;
        }
        return 0;
    }
}
