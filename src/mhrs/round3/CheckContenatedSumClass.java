package mhrs.round3;

public class CheckContenatedSumClass {
    public static void main(String[] args){
        System.out.println(checkConcatenatedSum(198,2));
        System.out.println(checkConcatenatedSum(198,3));
        System.out.println(checkConcatenatedSum(2997,3));
        System.out.println(checkConcatenatedSum(2997,2));
        System.out.println(checkConcatenatedSum(13332,4));
        System.out.println(checkConcatenatedSum(9,1));
    }
    static int checkConcatenatedSum(int n, int catlen){
        int tempN = n;
        int sum=0;
        while(tempN>0){
            int num=tempN%10;
            for(int i=2;i<=catlen;i++){
                num=(num*10)+tempN%10;
            }
            sum += num;
            tempN/=10;
        }
        if(n!=sum){
            return 0;
        }
        return 1;
    }
}
