package mhrs.round1;

import java.util.Arrays;

public class largestDifferenceOfEvensBySortClass {
    public static void main(String[] args) {
        //int[] a = new int[]{-2, 3, 9, 4}; //6
        //int[] a = new int[]{1, 3, 5, 9}; //-1
        int[] a = new int[]{1, 18, 5, 7, 33}; //-1
        //int[] a = new int[]{2, 2, 2, 2}; //0
        //int[] a = new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4}; //4
        largestDifferenceOfEvens(a);
    }

    static int largestDifferenceOfEvens(int[] a) {
        int diff = -1;
        int largestEven = -1;
        int smallestEven = -3;
        int[] tempA = Arrays.copyOf(a, a.length);
        Arrays.sort(tempA);
        for (int i = 0; i < tempA.length; i++) {
            if (smallestEven % 2 != 0) {
                if (a[i] % 2 == 0) {
                    smallestEven = i;
                }
            }
            if (largestEven % 2 != 0) {
                if (a[(a.length - 1) - i] % 2 == 0) {
                    largestEven = (a.length - 1) - i;
                }
            }
            if ((smallestEven != -3 && largestEven != -1) || smallestEven == largestEven) {
                break;
            }
        }
        if (smallestEven != 1 && largestEven != 1) {
            diff = a[largestEven] - a[smallestEven];
        }

        System.out.println("Largest even is " + a[largestEven]);
        System.out.println("Smalles even is " + a[smallestEven]);
        System.out.println("Difference is " + diff);
        return diff;
    }
}
