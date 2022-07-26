package mhrs.entrance;

import java.util.ArrayList;

public class isFibonacciClass {
    public static void main(String[] args) {
        int n = 21;
        isFibonacci(n);
    }

    static int isFibonacci(int n) {
        ArrayList<Integer> fiboCache = new ArrayList<>();
        int rt = 0;
        int fibo = 0;
        int index=0;
        if (n > 1) {
            while (fibo < n) {
                if (index < 2) {
                    fibo=1;
                } else {
                    fibo=fiboCache.get(index - 1) + fiboCache.get(index - 2);
                }
                fiboCache.add(fibo);
                index++;
            }
            System.out.println(fibo);
            if (n == fibo) {
                rt = 1;
            }
        } else if (n == 1) {
            rt = 1;
        }
        System.out.println(rt);
        return rt;
    }
}
