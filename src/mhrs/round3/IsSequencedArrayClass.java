package mhrs.round3;

public class IsSequencedArrayClass {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 4, 4, 4, 5}, 2, 5)); //1
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 5, 5, 5}, 2, 5)); //0
        System.out.println(isSequencedArray(new int[]{0, 2, 2, 3, 3}, 2, 3)); //0
        System.out.println(isSequencedArray(new int[]{1, 1, 3, 2, 2, 4}, 2, 4)); //0
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5)); //1
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5)); //0
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2)); //1
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5)); //0
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5)); //0
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5)); //0
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5)); //0
    }

    static int isSequencedArray(int[] a, int m, int n) {
        if ((a.length < (n - m) + 1) || m > n || a[0] != m || a[a.length - 1] != n) {
            return 0;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > n || a[i] < m) {
                return 0;
            } else {
                if (a[i] != a[i + 1] && a[i] != a[i + 1] - 1) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
