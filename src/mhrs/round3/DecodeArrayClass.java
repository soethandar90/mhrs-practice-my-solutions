package mhrs.round3;

public class DecodeArrayClass {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));
    }

    static int decodeArray(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int decodedNum = Math.abs(a[0] - a[1]);
        for (int i = 1; i < a.length - 1; i++) {
            decodedNum = (decodedNum * 10) + Math.abs(a[i] - a[i + 1]);
        }
        if(a[0]<0){
            decodedNum *= -1;
        }
        return decodedNum;
    }
}
