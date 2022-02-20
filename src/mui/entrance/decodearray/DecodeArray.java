package mui.entrance.decodearray;

public class DecodeArray {
    public static void main(String[] args) {
        //int[] a = new int[]{2, -3, -2, 6, 9, 18}; //51839
        //int[] a = new int[]{0, -3, 0, -4, 0};
        //int[] a = new int[]{-1, 5, 8, 17, 15};//-6392
        //int[] a = new int[]{1, 5, 8, 17, 15};//4392
        //int[] a = new int[]{111, 115, 118, 127, 125};//4392
        //int[] a = new int[]{1, 1};//0
        int[] a = new int[]{1};//0
        decodeArray(a);
    }

    static int decodeArray(int[] a) {
        int decodedNum = 0;
        if (a.length >= 2) {
            String absSum = "";
            for (int i = 0; i < a.length - 1; i++) {
                absSum += Integer.toString(Math.abs(a[i] - a[i + 1]));
            }
            decodedNum = Integer.parseInt(absSum);
            if (a[0] < 0) {
                decodedNum *= -1;
            }
        }
        System.out.println(decodedNum);
        return decodedNum;
    }
}
