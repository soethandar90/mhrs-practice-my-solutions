package mhrs.round1;

public class isPairedNClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 4, 2, 4, 5, 6};int n = 6;//1
        //int[] a = new int[]{1, 4, 1, 4, 5, 6};int n = 5;//1
        //int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};int n = 6;//1
        //int[] a = new int[]{1, 4, 1};int n = 5;//0
        //int[] a = new int[]{8, 8, 8, 8, 7, 7, 7};int n = 15;//0
        //int[] a = new int[]{8, -8, 8, 8, 7, 7, -7};int n = -15;//0
        //int[] a = new int[]{3};int n = 3;//0
        int[] a = new int[]{};int n = 0;//0
        isPairedN(a, n);
    }

    static int isPairedN(int[] a, int n) {
        int rt = 0;
        int len = a.length;
        if (n >= 0 && n <= len && len > 0) {
            int lastIndex = 0;
            if (n == len) {
                lastIndex = n - 1;
            } else {
                lastIndex = n;
            }
            for (int i = 0; i <= n / 2; i++) {
                if (i != n - i) {
                    if (a[i] + a[lastIndex - i] == n) {
                        System.out.println(i + " , " + (lastIndex - i));
                        System.out.println(a[i] + " , " + a[lastIndex - i]);
                        System.out.println("----");
                        rt = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(rt);
        return rt;
    }
}
