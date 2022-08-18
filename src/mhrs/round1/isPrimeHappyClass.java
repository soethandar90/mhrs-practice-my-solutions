package mhrs.round1;

public class isPrimeHappyClass {
    public static void main(String[] args) {
        isPrimeHappy(5);
        isPrimeHappy(25);
        isPrimeHappy(32);
        isPrimeHappy(8);
        isPrimeHappy(2);
    }

    static int isPrimeHappy(int n) {
        int rt = 0;
        if (n > 2) {
            int primeSum = 0;
            for (int i = 2; i < n; i++) {
                if (i > 2) {
                    int divisibleCount = 0;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            break;
                        } else {
                            divisibleCount++;
                        }
                    }
                    if (i - 2 == divisibleCount) {
                        primeSum += i;
                    }
                } else {
                    primeSum += i;
                }
            }
            if (primeSum % n == 0) {
                rt = 1;
            }
        }
        return rt;
    }
}
