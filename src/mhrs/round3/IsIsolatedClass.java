package mhrs.round3;

public class IsIsolatedClass {
    public static void main(String[] args) {
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));
        System.out.println(isIsolated(2097152));
    }

    static int isIsolated(long n) {
        if (n > 2097151) {
            return -1;
        }
        long sqr = n * n;
        long cube = n * n * n;
        while (sqr > 0) {
            while (cube > 0) {
                if (cube % 10 == sqr % 10) {
                    return 0;
                }
                cube /= 10;
            }
            sqr /= 10;
        }
        return 1;
    }
}
