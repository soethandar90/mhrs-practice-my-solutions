package mhrs.entrance;

public class convertToBase10Class {
    public static void main(String[] args) {
        //int[] inArray = new int[]{1, 0, 1, 1};int base = 2;//11
        //int[] inArray = new int[]{1, 1, 2};int base = 3;//14
        //int[] inArray = new int[]{3,2,5};int base = 8;//213
        int[] inArray = new int[]{3, 7, 1};
        int base = 6;//213
        System.out.println(convertToBase10(inArray, base));
    }

    static int convertToBase10(int[] inArray, int base) {
        int result = 0;
        int baseResult = 1;
        int lastIndex = inArray.length - 1;
        if (isLegalNumber(inArray, base) == 1) {
            for (int i : inArray) {
                if (i > 0) {
                    for (int j = lastIndex; j >= 1; j--) {
                        baseResult *= base;
                    }
                    result += i * baseResult;
                }
                lastIndex--;
                baseResult = 1;
            }
        }
        return result;
    }

    static int isLegalNumber(int[] inArray, int base) {
        int rt = 1;
        for (int i : inArray) {
            if (i >= base) {
                rt = 0;
                break;
            }
        }
        return rt;
    }


}
