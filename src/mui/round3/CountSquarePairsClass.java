package mui.round3;

public class CountSquarePairsClass {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{11, 5, 4, 20}));//3
        System.out.println("-----");
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));//2
        System.out.println(countSquarePairs(new int[]{9}));//2
    }

    static int countSquarePairs(int[] a) {
        if(a.length<2){
            return 0;
        }
        int cnt = 0;
        int j = 0;
        while (j < a.length) {
            for (int i = j+1; i < a.length; i++) {
                if (a[j]>0 && a[i]>0 && isPerfectSquare(a[j] + a[i]) == 1) {
                    cnt++;
                }
            }
            j++;
        }
        return cnt;
    }

    static int isPerfectSquare(int n) {
       int i=1;
       while(i*i<n){
            i++;
       }
        if(i*i==n){
            return 1;
        }
        return 0;
    }
}
