package mhrs.round3;

public class LargestPrimeFactorClass {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }
        int i = 2;
        int lpf = i;
        while (i <= n / 2) {
            if (n % i == 0 && isPrime(i) && i > lpf) {
                lpf = i;
            }
            i++;
        }
        return lpf;
    }

    static boolean isPrime(int n) {
        if (n > 2) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
