package mui.entrance;

public class findPorcupineNumberClass {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(149)); //179
        System.out.println(findPorcupineNumber(148)); //149
        System.out.println(findPorcupineNumber(138)); //139
    }

    static int findPorcupineNumber(int n) {
        int rt = 0;
        boolean foundPorcupine = false;
        do {
            n += 1;
            int pResult = checkPrimeNumber(n);
            if (pResult > 0 && pResult % 10 == 9) {
                foundPorcupine = true;
                //System.out.println("Porcupine!!!! "+pResult);
                rt = pResult;
            }
        } while (!foundPorcupine);

        return rt;
    }

    static int checkPrimeNumber(int n) {
        int rt = 0;
        if (n < 2) {
            //System.out.println(n + " is not prime number.");
            rt = 0;
        } else if (n == 2) {
            //System.out.println(n + " is a prime number.");
            rt = n;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    //System.out.println(n + " is not prime number.");
                    rt = 0;
                    break;
                }
                rt = n;
            }

        }
        return rt;
    }
}
