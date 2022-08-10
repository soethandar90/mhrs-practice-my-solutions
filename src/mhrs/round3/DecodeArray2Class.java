package mhrs.round3;

public class DecodeArray2Class {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0, 1}));
        System.out.println(decodeArray(new int[]{-1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }

    static int decodeArray(int[] a) {
        int n = 0;
        int i = 0;
        int cnt = 0;
        while (i < a.length) {
            if (a[i] == 0) {
                cnt++;
            }
            if (a[i] == 1) {
                n = (n * 10) + cnt;
                cnt = 0;
            }
            i++;
        }
        if (a[0] == -1) {
            n *= -1;
        }

        return n;
    }

}
