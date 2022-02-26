package mui.entrance;

public class encodeNumberClass {
    public static void main(String[] args) {
        //int n = 10;//2 5
        //int n = 6936;//2 2 2 3 17 17
        //int n = 1;// null
        //int n= 2;//2
        //int n= 6;//2 3
        //int n= 14;//2 7
        //int n= 24;//2 2 2 3
        //int n= 1200;//2 2 2 2 3 5 5
        int n= -18;//null
        encodeNumber(n);
    }

    static int[] encodeNumber(int n) {
        int encodeSize = 0;
        int[] result = new int[]{};
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                while (n % i == 0) {
                    encodeSize++;
                    result = createResult(encodeSize, result, i);
                    n = n / i;
                }
            }
            if (n >= 2) {
                encodeSize++;
                result = createResult(encodeSize, result, n);
            }
            for (int t:result) {
                System.out.print(t+" ");

            }
        }else{
            result=null;
        }
        return result;
    }

    private static int[] createResult(int encodeSize, int[] result, int i) {
        int[] tempResult = new int[encodeSize];
        for (int j = 0; j < result.length; j++) {
            tempResult[j] = result[j];
        }
        tempResult[tempResult.length - 1] = i;
        result = tempResult;
        return result;
    }
}
