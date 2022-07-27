package mhrs.round3;

public class SumFactorClass {
    public static void main(String[] args){
        System.out.println(sumFactor(new int[]{1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[]{1,2,3,4}));
        System.out.println(sumFactor(new int[]{}));
        System.out.println(sumFactor(new int[]{3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[]{9, -3, -3, -1, -1}));
        System.out.println(sumFactor(new int[]{1}));
        System.out.println(sumFactor(new int[]{0,0,0}));
    }
    static int sumFactor(int[] a){
        if(a.length<1){
            return 0;
        }
        int sum=0;
        int cnt=0;
        for(int i:a){
            sum+=i;
        }
        for(int j:a){
            if(j==sum){
                cnt++;
            }
        }
        return cnt;
    }
}
