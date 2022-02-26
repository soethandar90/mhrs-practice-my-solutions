package mui.entrance;

public class sampleMiddleLess {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 3, 4, 5}; //0
        //int[] a = new int[]{3, 2, 1, 4, 5}; //1
        //int[] a = new int[]{3, 2, 1, 4, 1}; //0
        //int[] a = new int[]{1, 2, 3, 4}; //0
        //int[] a = new int[]{}; //0
        int[] a = new int[]{10}; //0
        isMiddleLess(a);
    }

    public static int isMiddleLess(int[] a) {
        int rt = 1;
        int len = a.length;
        if (len > 0) {
            if (len % 2 > 0) {
                for (int i = 0; i < len; i++) {
                    if (i != (len / 2)) {
                        if (a[i] <= a[len / 2]) {
                            rt = 0;
                            break;
                        }
                    }
                }
            } else {
                rt = 0;
            }
        }
        System.out.println(rt);
        return rt;
    }
}
