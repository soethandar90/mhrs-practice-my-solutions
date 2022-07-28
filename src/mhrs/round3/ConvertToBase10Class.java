package mhrs.round3;

public class ConvertToBase10Class {
    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{1, 0, 1, 1}, 2)); //returns 11
        System.out.println(convertToBase10(new int[]{1, 1, 2}, 3)); //returns 14
        System.out.println(convertToBase10(new int[]{3, 2, 5}, 8)); //returns 213
        System.out.println(convertToBase10(new int[]{3, 7, 1}, 6)); //returns 0
    }

    static int convertToBase10(int[] a, int base) {
        int baseN = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] >= base) {
                return 0;
            }
            int m = 1;
            for (int j = 1; j <= (a.length - 1) - i; j++) {
                m *= base;
            }
            baseN += a[i] * m;
        }
        return baseN;
    }
}
