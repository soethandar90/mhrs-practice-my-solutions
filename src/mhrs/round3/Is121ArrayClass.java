package mhrs.round3;

public class Is121ArrayClass {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a) {
        if (a.length < 1 || a[0] > 1 || a[a.length - 1] > 1) {
            return 0;
        }
        boolean oneflag = true;
        for (int i = 0; i < (a.length / 2) + (a.length % 2); i++) {
            if (a[i] == a[(a.length - 1) - i]) {
                if (a[i] == 2 && oneflag) {
                    oneflag = false;
                }
                if (a[i] == 1 && !oneflag) {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        if (oneflag) {
            return 0;
        }
        return 1;
    }

}
