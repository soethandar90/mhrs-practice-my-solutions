package mhrs.round3;

public class StantonMeasureClass {
    public static void main(String[] args){
        System.out.println(stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3,2}));
        System.out.println(stantonMeasure(new int[]{1}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{3,1,1,4}));
        System.out.println(stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(stantonMeasure(new int[]{}));
    }
    static int stantonMeasure(int[] a){
        int n=0;
        int nextInt = 1;
        int loop=1;
        while(loop<=2) {
            n = 0;
            for (int i : a) {
                if (i == nextInt) {
                    n++;
                }
            }
            nextInt=n;
            loop++;
        }
        return n;
    }
}
