package mhrs.entrance;

public class largestDifferenceOfEvensClass {
    public static void main(String[] args) {
        //int[] a = new int[]{-2, 3, 4, 9}; //6
        //int[] a = new int[]{1, 3, 5, 9}; //-1
        //int[] a = new int[]{1, 18, 5, 7, 33}; //-1
        //int[] a = new int[]{2, 2, 2, 2}; //0
        int[] a = new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}; //4
        largestDifferenceOfEvens(a);
    }

    static int largestDifferenceOfEvens(int[] a) {
        int diff = -1;
        int largestEven = 0;
        int smallestEven = 0;
        int evenCnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (evenCnt == 0) {
                    largestEven = a[i];
                    smallestEven = a[i];
                } else {
                    if (a[i] > largestEven) {
                        largestEven = a[i];
                    }
                    if (a[i] < smallestEven) {
                        smallestEven = a[i];
                    }
                }
                evenCnt++;
            }
        }
        if (evenCnt > 1) {
            diff = largestEven - smallestEven;
        }
        System.out.println("Largest even is "+largestEven);
        System.out.println("Smalles even is "+smallestEven);
        System.out.println("Count is "+evenCnt);
        System.out.println("Difference is "+diff);
        return diff;
    }
}
