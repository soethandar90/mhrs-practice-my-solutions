package mhrs.entrance;

public class isSystematicallyIncreasingClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}; //1
        //int[] a = new int[]{1, 3, 2, 1, 2, 3, 1, 2, 3, 4};//0
        //int[] a = new int[]{1};//1
        //int[] a = new int[]{1,2,1,2,3};//0
        //int[] a = new int[]{1,1,3};//0
        //int[] a = new int[]{1,2,1,2,1,2};//0
        //int[] a = new int[]{1, 2, 3, 1, 2, 1};//0
        int[] a = new int[]{1, 1, 2, 3};
        isSystematicallyIncreasing(a);
    }

    static int isSystematicallyIncreasing(int[] a){
        int rt=1;
        int len = a.length;
        int seq=0;
        int i=0;
        while(seq<len){
            i++;
            seq += i;
        }
        if(len==seq){
            int startIndex=0;
            outerloop:
            for(int j=1;j<=i;j++){
                for(int k=1; k<=j;k++){
                    if(a[startIndex]!=k){
                        rt=0;
                        break outerloop;
                    }
                    startIndex++;
                }
            }
        }else{
            rt=0;
        }
        System.out.println(rt);
        return rt;
    }
}
