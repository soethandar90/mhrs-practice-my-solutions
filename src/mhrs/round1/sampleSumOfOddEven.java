package mhrs.round1;

public class sampleSumOfOddEven {
    public static void main(String[] args) {
        //int[] a = new int[]{1}; //1
        //int[] a = new int[]{1,2}; //-1
        //int[] a = new int[]{1,2,3}; //2
        //int[] a = new int[]{1,2,3,4}; //-2
        //int[] a = new int[]{3,3,4,4}; //-2
        //int[] a = new int[]{3,2,3,4}; //0
        //int[] a = new int[]{4,1,2,3}; //-2
        //int[] a = new int[]{1,1}; //2
        int[] a = new int[]{}; //2
        //int[] a = null; //0
        System.out.println(f(a));
    }

    static int f(int[] a) {
        int x = 0;
        int y = 0;
        if (a != null) {
            for (int n : a) {
                if (n % 2 > 0) {
                    x += n;
                } else {
                    y += n;
                }
            }
        }
        return x - y;
    }
}
