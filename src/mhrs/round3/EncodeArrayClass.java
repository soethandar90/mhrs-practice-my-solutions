package mhrs.round3;

public class EncodeArrayClass {
    public static void main(String[] args) {
        System.out.println(encodeArray(100001));
    }

    static int[] encodeArray(int n) {
        if (n == 0) {
            return new int[]{1};
        }
        int size = 0;
        if (n < 10) {
            size = 1;
        }
        int tempN = n;
        while (tempN > 0) {
            size = (size + tempN % 10) + 1;
            tempN /= 10;
        }
        tempN = n;
        int[] result = new int[size];
        while(tempN>0){ 
            int start = result.length-1;
            int end = 0;
           // for(int i=result.length-1;i>0;i--)
        }


        return new int[]{};
    }
}
