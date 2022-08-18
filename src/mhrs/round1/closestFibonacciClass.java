package mhrs.round1;

import java.util.ArrayList;

public class closestFibonacciClass {
    static ArrayList<Integer> fiboCache = new ArrayList<>();

    public static void main(String[] args) {
        int n = 21; //21
        //int n = 13; //13
        //int n = 33; //21
        //int n = 34; //34
        closestFibonacci(n);
    }

    static int closestFibonacci(int n) {
        int rt = 0;
        int index = 0;
        int fibo = 0;
        if (n > 1) {
            while (fibo < n) {
                if (index < 2) {
                    fibo = 1;
                } else {
                    fibo = fiboCache.get(index - 1) + fiboCache.get(index - 2);
                }
                index++;
                fiboCache.add(fibo);
            }
            if (n == fibo) {
                rt = fiboCache.get(index - 1);
            } else {
                rt = fiboCache.get(index - 2);
            }
        }else if(n==1){
            rt=1;
        }
        System.out.println(rt);
        return rt;
    }
}
