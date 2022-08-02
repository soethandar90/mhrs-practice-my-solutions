package mhrs.round3;

public class GetExponentClass {
    public static void main(String[] args){
        System.out.println(getExponent(162,3)); //4
        System.out.println(getExponent(27,3)); //3
        System.out.println(getExponent(28,3)); //0
        System.out.println(getExponent(280,7)); //1
        System.out.println(getExponent(-250,5)); //3
        System.out.println(getExponent(18,1)); //-1
        System.out.println(getExponent(128,4)); //3

    }
    static int getExponent(int n, int p){
        if(p<=1){
            return -1;
        }
        int exp=0;
        while(Math.abs(n)>=p && n%p==0){
                exp++;
                n/=p;
        }
        return exp;
    }

}
