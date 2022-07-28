package mhrs.round3;

public class MatchesClass {
    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1}));
        System.out.println("---------------");
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }

    static int matches(int[] a, int[] p) {
        int len = 0;
        for (int k : p) {
            len += Math.abs(k);
        }
        if (a.length != len) {
            return 0;
        }

        int z = 0;
        //for (int j = 0; j < p.length; j++) {
        //    if (p[j] == 0) {
        //        return 0;
        //    }
        //    int i = 0;
        //    while (i <= Math.abs(p[j]) - 1) {
        //        if ((p[j] > 0 && a[z + i] < 0) || (p[j] < 0 && a[z + i] > 0) || a[z + i] == 0) {
        //            return 0;
        //        }
        //        i++;
        //    }
        //    z += Math.abs(p[j]);
        //}

        for (int j:p) {
            if (j == 0) {
                return 0;
            }
            int i = 0;
            while (i <= Math.abs(j) - 1) {
                if ((j > 0 && a[z + i] < 0) || (j < 0 && a[z + i] > 0) || a[z + i] == 0) {
                    return 0;
                }
                i++;
            }
            z += Math.abs(j);
        }
        return 1;
    }

}
