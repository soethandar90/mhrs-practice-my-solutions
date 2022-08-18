package mhrs.round1;

public class sampleCommonIntegers {
    public static void main(String[] args) {
        //int[] first = new int[]{1, 2, 3, 4, 6};int[] second = new int[]{4, 5, 6, 7};//4 6
        //int[] first = new int[]{1, 8, 3, 2};int[] second = new int[]{4, 2, 6, 1};//1 2
        //int[] first = new int[]{1, 8, 3, 2, 6};int[] second = new int[]{2, 6, 1};//2 6
        //int[] first = new int[]{1, 3, 7, 9};int[] second = new int[]{7, 1, 9, 3};//1 3 7 9
        //int[] first = new int[]{1, 2};int[] second = new int[]{3, 4};//{}
        //int[] first = new int[]{};int[] second = new int[]{1, 2, 3};//{}
        //int[] first = new int[]{1, 2};int[] second = new int[]{};//{}
        //int[] first = new int[]{1, 2};int[] second = null;//null
        //int[] first = null;int[] second = new int[]{};//null
        int[] first = null;
        int[] second = null;//null
        f(first, second);
    }

    static int[] f(int[] first, int[] second) {
        if (first == null || second == null) {
            return null;
        }
        if (first.length > 0 && second.length > 0) {
            int[] tempA;
            int len;
            int start = 0;
            int cmnCount = 0;
            if (first.length <= second.length) {
                len = first.length;
            } else {
                tempA = first;
                len = second.length;
                first = second;
                second = tempA;
            }
            tempA = new int[len];
            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < second.length; j++) {
                    if (first[i] == second[j]) {
                        tempA[start] = first[i];
                        start++;
                        cmnCount++;
                        break;
                    }
                }
            }
            int[] result = new int[cmnCount];
            for (int i = 0; i < cmnCount; i++) {
                result[i] = tempA[i];
            }
            for (int r : result) {
                System.out.println(r);
            }
            return result;
        } else {
            return new int[]{};
        }
    }
}
