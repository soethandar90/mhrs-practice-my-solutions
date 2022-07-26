package mhrs.round3;

public class PrimeCountClass {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
        //primeCount(-10, 6);
    }

    static int primeCount(int start, int end) {
        if (start > end) {
            return 0;
        }
        if(start<=0){
            start=2;
        }
        int pCnt = (end - start)+1;
        for (int i = start; i <= end; i++) {
            if (i > 2) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        pCnt--;
                        //System.out.println(i);
                        break;
                    }
                }
            }
        }
        return pCnt;
    }

}
