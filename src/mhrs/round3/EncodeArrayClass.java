package mhrs.round3;

public class EncodeArrayClass {
    public static void main(String[] args) {

        encodeArray(0);
        encodeArray(1);
        encodeArray(-1);
        encodeArray(100001);
        encodeArray(999);
    }

    static int[] encodeArray(int n) {
        int size = 0;
        if (n <= 0) {
            size = 1;
        }
        //first pass to compute the size of array.
        int tempN = Math.abs(n);
        while (tempN > 0) {
            size = (size + tempN % 10)+1;
            tempN /= 10;
        }

        //second pass to set the elements.
        int[] result = new int[size];
        tempN = Math.abs(n);
        int lastIndex =  size-1;
        result[lastIndex]=1;
        while(tempN>9){
            lastIndex = (lastIndex - (tempN%10)-1);
            result[lastIndex] = 1;
            tempN/=10;
        }
        if (n < 0) {
            result[0] = -1;
        }

        for(int i:result){
            System.out.print(i+" ");
        }
        System.out.println();

        return result;
    }
}
