package mhrs.round3;

public class RecursionClass {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(total(1, 3));
    }

    private static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    private static int total(int n, int m) {
        if (m > n) {
            return m + (total(n, m - 1));
        } else {
            return m;
        }
    }

}
