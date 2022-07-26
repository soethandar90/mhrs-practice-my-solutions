package mhrs.round3;

public class NUpCountClass {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2},5));
        System.out.println(nUpCount(new int[]{6,3,1},6));
        //System.out.println(nextPerfectSquare(0));
        //System.out.println(nextPerfectSquare(-5));
    }

    static int nUpCount(int[] a, int n){
        int sum=0;
        int upCnt=0;
        for(int i:a){
            //int partialSum = sum;
            if(sum<=n && sum+i>n){
                upCnt++;
            }
            sum += i;
        }
        return upCnt;
    }
}
