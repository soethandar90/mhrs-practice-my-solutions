package mui.entrance.primehappy;

public class PrimeHappy {
    public static void main(String[] args) {
        //int n = 5; //1
        //int n = 25; //1
        //int n = 32; //1
        //int n = 8; //0
        int n = 2; //0
        isPrimeHappy(n);
    }

    static int isPrimeHappy(int n) {
        int rt = 0;
        int primeSum = 0;
        if (n > 2) {
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
        System.out.println(rt);
        return rt;
    }

}
