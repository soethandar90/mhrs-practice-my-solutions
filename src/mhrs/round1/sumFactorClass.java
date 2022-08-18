package mhrs.round1;

public class sumFactorClass {
    public static void main(String[] args) {
        int[] inputArr = new int[]{1,-1,1,-1,1,-1,1}; //0
        //int[] inputArr = new int[]{0,0,0}; //3
        //int[] inputArr = new int[]{1}; //1
        //int[] inputArr = new int[]{9,-3,-3,-1,-1}; //0
        //int[] inputArr = new int[]{3,0,2,-5,0}; //2
        System.out.println(sumFactor(inputArr));
    }

    static int sumFactor(int[] a) {
        int sum = 0;
        int factor = 0;
        for (int i : a) {
            sum += i;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==sum){
                factor+=1;
            }
        }
        return factor;
    }
}
