package mhrs.entrance;

public class isOnionArrayClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 19, 4, 5}; //1
        //int[] a = new int[]{1, 2, 3, 4, 15};//0
        //int[] a = new int[]{1, 3, 9, 8};//0
        //int[] a = new int[]{2};//1
        //int[] a = new int[]{};//1
        int[] a = new int[]{-2,5,0,5,12};//1
        isOnionArray(a);
    }

    static int isOnionArray(int[] a) {
        int rt = 1;
        int len = a.length;
        int k = len - 1;
        int j = 0;
        if (len > 1) {
            for (int i = 0; i < len / 2; i++) {
                if (a[j + i] + a[k - i] > 10) { //j+k=length of array
                    rt = 0;
                    break;
                }
            }
        }
        System.out.println(rt);
        return rt;
    }

}