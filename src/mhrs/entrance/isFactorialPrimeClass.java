package mhrs.entrance;

public class isFactorialPrimeClass {
    public static void main(String[] args) {
        //int n = 2; //1
        //int n=3;//1
        //int n=7;//1
        //int n=8;//0
        //int n=11;//0
        //int n = 721;//0
        int n = -2;//0
        isFactorialPrime(n);
    }

    static int isFactorialPrime(int n) {
        int rt = 1;
        if (n > 0) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    rt = 0;//not prime;
                    break;
                }
            }
            if (rt == 1) {
                rt = 0;
                for (int i = 1; i < n; i++) {
                    if (findFactorialPrime(i) == n) {
                        rt = 1;
                        System.out.println("Factorial prime is " + i);
                        break;
                    }
                }
            }
        } else {
            rt = 0;
        }
        System.out.println("Return is " + rt);
        return rt;
    }

    static private int findFactorialPrime(int n) {
        int factoMultiply = 1;
        for (int i = 1; i <= n; i++) {
            factoMultiply *= i;
        }
        return factoMultiply + 1;
    }
}
