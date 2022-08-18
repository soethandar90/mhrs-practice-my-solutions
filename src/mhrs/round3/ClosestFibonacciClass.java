package mhrs.round3;

public class ClosestFibonacciClass {
    public static void main(String[] args){
    System.out.println(closestFibonacci(13));
    }
    static int closestFibonacci(int n){
        int result = 0;
        int i=1;
        while(result<n){
            result = findFibo(i);
            i++;
        }
        return result;
    }

    static int findFibo(int n){
        if(n<=1){
            return n;
        }
        return findFibo(n-1)+findFibo(n-2);
    }
}
