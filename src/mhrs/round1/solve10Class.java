package mhrs.round1;

public class solve10Class {
    public static void main(String[] args) {
        solve10();
    }

    static int[] solve10() {
        final int solveDigit = 10;
        int[] a = new int[]{0, solveDigit};
        int[] factorialCache = new int[solveDigit];
        for (int i = 1; i <= solveDigit; i++) {
            if (i == 1) {
                factorialCache[i - 1] = i;
            } else {
                factorialCache[i - 1] = factorialCache[i - 2] * i;
            }
        }
        outerloop:
        for (int x = 0; x < factorialCache.length - 1; x++) {
            for (int y = x + 1; y < factorialCache.length - 1; y++) {
                if (factorialCache[x] + factorialCache[y] == factorialCache[solveDigit - 1]) {
                    a[0] = x;
                    a[1] = y;
                    break outerloop;
                }
                System.out.println(factorialCache[x] + " " + factorialCache[y]);
                System.out.println("------");
            }
        }
        return a;
    }
}
