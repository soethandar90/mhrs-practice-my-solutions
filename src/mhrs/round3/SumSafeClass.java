package mhrs.round3;

public class SumSafeClass {
    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        System.out.println(isSumSafe(new int[]{}));
    }

    static int isSumSafe(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        for (int j : a) {
            if (sum == j) {
                return 1;
            }
        }
        return 0;
    }
}
