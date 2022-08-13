package mhrs.round3;

public class IsHodderClass {
    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
    }

    static int isHodder(int n) {
        if (isPrime(n)) {
            int h = 1;
            while (h < n+1) {
                h *= 2;
            }
            if (h-1 == n) {
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
