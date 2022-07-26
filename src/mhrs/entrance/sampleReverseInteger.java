package mhrs.entrance;

public class sampleReverseInteger {
    public static void main(String[] args) {
        //int n = 215;//512
        //int n = 12005;//50021
        //int n = 1;//1
        //int n = 1000;//1
        //int n = 0;//1
        int n = -12345;//-54321
        f(n);
    }

    static int f(int n) {
        int revInt=0;
        while (n!=0) {
            revInt =  (n % 10)+(revInt*10);
            n /= 10;
        }
        System.out.println(revInt);
        return revInt;
    }
}
