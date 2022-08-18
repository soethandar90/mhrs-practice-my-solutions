package mhrs.round1;

public class encodeArrayClass {
    public static void main(String[] args) {
        //int n = 12;// {0,1,0,0,1}
        //int n = -12;// {-1,0,1,0,0,1}
        //int n = 0;//{1}
        //int n = 1; //{0,1}
        //int n = -1;//{-1,0,1}
        //int n = 100001;// {0, 1, 1, 1, 1, 1, 0, 1}
        int n = 999;
        encodeArray(n);
    }
    static int[] encodeArray(int n) {
        int[] encodedArray = new int[]{1};
        if (n != 0) {
            int encodeArraySize = 0;
            int tempN = Math.abs(n);
            if (n < 0) {
                encodeArraySize++;
            }
            //while (tempN % 10 != 0) {
            while (tempN != 0) {
                encodeArraySize += (tempN % 10) + 1;
                tempN /= 10;
            }
            tempN = Math.abs(n);
            encodedArray = new int[encodeArraySize];
            int lastIndex = encodeArraySize - 1;
            while (tempN != 0) {
                encodedArray[lastIndex] = 1;
                lastIndex -= (tempN % 10) + 1;
                tempN /= 10;
            }
            if (n < 0) {
                encodedArray[0] = -1;
            }
        }
        return encodedArray;
    }
}
