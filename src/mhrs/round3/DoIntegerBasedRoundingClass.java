package mhrs.round3;

public class DoIntegerBasedRoundingClass {
    public static void main(String[] args) {
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3);
        doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3);
        doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5);
        doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100);
    }

    static void doIntegerBasedRounding(int[] a, int n) {
        if (n > 0) {
            for (int i=0;i<a.length;i++) {
                if (a[i] > 0) {
                    int start = 0;
                    int end = n;
                    if (a[i] > n) {
                        start = (a[i] / n) * n;
                        end = start + n;
                    }
                    if (Math.abs(start - a[i]) >= (end - a[i])) {
                        a[i] = a[i] + (end - a[i]);
                    } else {
                        a[i] = start;
                    }
                }
            }
        }
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
