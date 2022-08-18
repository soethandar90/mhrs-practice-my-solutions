package mhrs.round1;

/*
 * Zero and 1 are not prime number.
 * Prime >1, whole number, positive.
 * */
public class primeCountClass {
    public static void main(String[] args) {
        System.out.println("Prime Count is " + primeCount(10, 30));
    }

    static int primeCount(int start, int end) {
        int pcount = 0;
        if (start < 2) {
            start = 2;
        }
        pcount = (end - start) + 1;
        for (int i = start; i <= end; i++) {
            //System.out.print(i+" ");
            if (i != 2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        pcount -= 1;
                        //System.out.println("Non-prime : " + i); //To validate non-primes
                        break;
                    }
                }
            }
        }
        return pcount;
    }
}
