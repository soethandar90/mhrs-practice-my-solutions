package mhrs.round3;

public class ComputeDepthClass {
    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }

    static int computeDepth(int n) {
        int[] digitArray = new int[]{};
        int i = 0;
        while (digitArray.length < 10) {
            i++;
            int result = n * i;
            while (result > 0) {
                int isExist = 0;
                int p = result % 10;
                for (int j : digitArray) {
                    if (j == p) {
                        isExist++;
                        break;
                    }
                }
                if (isExist == 0) {
                    //int[] tempArray = new int[digitArray.length + 1];
                    //for (int k = 0; k < digitArray.length; k++) {
                    //    tempArray[k] = digitArray[k];
                    //}
                    //tempArray[tempArray.length - 1] = p;
                    //digitArray = tempArray;

                    int[] tempArray = new int[digitArray.length + 1];
                    System.arraycopy(digitArray, 0, tempArray, 0, digitArray.length);
                    tempArray[tempArray.length - 1] = p;
                    digitArray = tempArray.clone();

                }
                result /= 10;
            }
        }
        return i;
    }
}
