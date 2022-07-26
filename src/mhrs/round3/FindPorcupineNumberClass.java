package mhrs.round3;

public class FindPorcupineNumberClass {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(18));
        System.out.println(findPorcupineNumber(138));
        System.out.println(findPorcupineNumber(139));

    }

    static int findPorcupineNumber(int n) {
        int firstPorcupine = 0;
        int nextPorcupine = 0;
        while (nextPorcupine == 0) {
            n++;
            if (isPrime(n) == 1) {
                if (n % 10 == 9) {
                    if(firstPorcupine == 0) {
                        firstPorcupine = n;
                    }else{
                        nextPorcupine=n;
                    }
                }else{
                    if(firstPorcupine != 0) {
                        firstPorcupine = 0;
                    }
                }
            }
        }
        return firstPorcupine;
    }

    static int isPrime(int n) {
        if (n < 2) {
            return 0;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
