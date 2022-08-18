package mhrs.round1;

public class isNUniqueClass {
    public static void main(String[] args) {
        //int[] inArray = new int[]{7, 3, 3, 2, 4};
        //int unique = 6;//0
        //int[] inArray = new int[]{7, 3, 3, 2, 4};
        //int unique = 10;//0
        //int[] inArray = new int[]{7, 3, 3, 2, 4};
        //int unique = 11;//1
        //int[] inArray = new int[]{7, 3, 3, 2, 4};
        //int unique = 8;//0
        //int[] inArray = new int[]{7, 3, 3, 2, 4};
        //int unique = 4;//0
        int[] inArray = new int[]{1};
        int unique = 4;//0
        System.out.println(isNUnique(inArray, unique));
    }

    static int isNUnique(int[] a, int n) {
        int rt = 0;
        int lastIndex = a.length - 1;
        if (lastIndex != 0) {
            int uniqueCount = 0;
            int strIndex = 0;
            int endIndex = 1;
            for (int j = strIndex; j < lastIndex; j++) {
                for (int i = endIndex; i <= lastIndex; i++) {
                    if (a[j] + a[i] == n) {
                        uniqueCount += 1;
                    }
                }
                strIndex += 1;
                endIndex += 1;
            }
            if (uniqueCount > 1) {
                rt = 0;
                System.out.println("Multiple " + n + "-unique.");
            } else if (uniqueCount == 0) {
                rt = 0;
                System.out.println("No " + n + "-unique.");
            } else {
                rt = 1;
                System.out.println("Found " + n + "-unique.");
            }
        } else {
            rt = 0;
            System.out.println("Array must have at least 2 elements.");
        }
        return rt;
    }

}
