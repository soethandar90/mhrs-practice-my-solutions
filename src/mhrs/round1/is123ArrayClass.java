package mhrs.round1;

public class is123ArrayClass {
    public static void main() {
        is123Array(new int[]{1, 2, 3, 1, 2, 3});
        is123Array(new int[]{1, 2, 3, 3, 2, 1});
        is123Array(new int[]{0, 1, 2, 3, 1, 2, 3});
        is123Array(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3});
        is123Array(new int[]{1, 2, 3});
        is123Array(new int[]{});
    }

    static int is123Array(int[] a) {
        int rt = 1;
        if (a.length % 3 == 0 && a.length > 0 && a != null && a[0] == 1 && a[a.length - 1] == 3) {
            int start = 0;
            while (start < a.length - 1) {
                if (a[start] != 1 || a[start + 1] != 2 || a[start + 2] != 3) {
                    rt = 0;
                    break;
                }
                start += 3;
            }
        } else {
            rt = 0;
        }
        return rt;
    }
}
