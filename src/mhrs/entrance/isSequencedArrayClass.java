package mhrs.entrance;

public class isSequencedArrayClass {
    public static void main(String[] args) {
        //int[] a = new int[]{2, 2, 3, 4, 4, 4, 5};int m = 2;int n = 5;//1
        //int[] a = new int[]{2, 2, 3, 5, 5, 5};int m = 2;int n = 5;//0
        //int[] a = new int[]{0, 2, 2, 3, 3};int m = 2;int n = 3;//0
        //int[] a = new int[]{1, 1, 3, 2, 2, 4};int m = 1;int n = 4;//0
        //int[] a = new int[]{1, 2, 3, 4, 5};int m = 1;int n = 5;//1
        //int[] a = new int[]{1, 3, 4, 2, 5};int m = 1;int n = 5;//0
        //int[] a = new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2};int m = -5;int n = -2;//1
        //int[] a = new int[]{0, 1, 2, 3, 4, 5};int m = 1;int n = 5;//0
        //int[] a = new int[]{1, 2, 3, 4};int m = 1;int n = 5;//1
        //int[] a = new int[]{1, 2, 5};int m = 1;int n = 5;//0
        int[] a = new int[]{5, 4, 3, 2, 1};int m = 1;int n = 5;//0
        isSequencedArray(a, m, n);
    }

    static int isSequencedArray(int[] a, int m, int n) {
        int rt = 0;
        if (a[0] == m && a[a.length - 1] == n && a.length>=n && m!=0) {
            int currentValue = m;
            for (int i : a) {
                if (i != currentValue) {
                    if (i > n) {
                        rt=0;
                        break;
                    } else {
                        if (i == currentValue + 1) {
                            currentValue = i;
                            rt = 1;
                        } else {
                            rt=0;
                            break;
                        }
                    }
                }
            }
        }
        return rt;
    }
}
