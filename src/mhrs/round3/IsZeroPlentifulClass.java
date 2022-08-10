package mhrs.round3;

public class IsZeroPlentifulClass {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
        System.out.println(isZeroPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{1, 2, 3, 4}));
        System.out.println(isZeroPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
        System.out.println(isZeroPlentiful(new int[]{}));
    }

    static int isZeroPlentiful(int[] a) {
        if(a.length<4){
            return 0;
        }
        int seq = 0;
        int i = 0;
        while (i < a.length-3) {
            if ((i == 0 && a[i] == 0) || (i > 0 && a[i - 1] != 0 && a[i] == 0)) {
                if (a[i + 1] == 0 && a[i + 2] == 0 && a[i + 3] == 0) {
                    seq++;
                    i += 2;
                } else {
                    return 0;
                }
            }
            i++;
        }
        return seq;
    }
}
