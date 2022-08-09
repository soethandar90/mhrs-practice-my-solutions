package mhrs.round3;

public class EncodeNumberClass {
    public static void main(String[] args) {
        encodeNumber(6936);
        encodeNumber(6);
        encodeNumber(12);
        encodeNumber(14);
        encodeNumber(24);
        encodeNumber(1200);
        encodeNumber(1);
        encodeNumber(-18);
    }

    static int[] encodeNumber(int n) {
        if(n<=1){
            return null;
        }
        int[] result = new int[0];
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int[] tempResult = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    tempResult[j] = result[j];
                }
                tempResult[tempResult.length - 1] = i;
                result = tempResult;
                n = n / i;
                i--;
            }
        }
        //for (int r : result) {
        //    System.out.print(r + " ");
        //}
        //System.out.println();
        return result;
    }

}
