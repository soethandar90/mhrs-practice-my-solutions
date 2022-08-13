package mhrs.round3;

public class IsFactorialPrimeClass {
    public static void main(String[] args){
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));

    }
    static int isFactorialPrime(int n){
        if(isPrime(n)){
            int i=0;
            int f=0;
            while(f<n){
                i+=1;
                f=findFactorial(i)+1;
            }
            if(f==n){
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int findFactorial(int i){
        if(i>=1){
            return i * findFactorial(i-1);
        }else{
            return 1;
        }
    }
}
