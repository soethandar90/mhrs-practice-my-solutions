package mhrs.entrance;

import java.util.Arrays;

public class isMinMaxDisjointClass {
    public static void main(String[] args) {
        //int[] a = new int[]{5, 4, 1, 3, 2};//1
        //int[] a = new int[]{18, -1, 3, 4, 0};//0
        //int[] a = new int[]{9, 0, 5, 9};//0
        int[] a = new int[]{0, 5, 18, 0, 9};//0
        //int[] a = new int[]{7, 7, 7, 7};//0
        //int[] a = new int[]{7, 7, 7, 7};//0
        //int[] a = new int[]{};//0
        //int[] a = new int[]{1,2};//0
        System.out.println("Returned" + isMinMaxDisjoint2(a));
    }
//with Arrays.Stream
    static int isMinMaxDisjoint2(int[] a) {
        int rt = 0;
        if (a.length != 0) {
            int maxCount = 0;
            int minCount = 0;
            int max = Arrays.stream(a).max().getAsInt();
            int min = Arrays.stream(a).min().getAsInt();
            int maxIndex=0;
            int minIndex=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==max){
                    maxCount++;
                    maxIndex=j;
                }if (a[j] == min) {
                    minCount++;
                    minIndex=j;
                }
            }
            if ((max == min) || (maxIndex + 1 == minIndex || minIndex + 1 == maxIndex) || (maxCount > 1 || minCount > 1)) {
                rt = 0;
                System.out.println("One or more conditions failed");
            } else {
                rt = 1;
            }
        }
        return rt;
    }

    static int isMinMaxDisjoint(int[] a) {
        int rt = 0;
        if (a.length != 0) {
            int maxIndex = 0;
            int minIndex = 0;
            int maxCount = 0;
            int minCount = 0;
            for (int i = 0; i < a.length; i++) {
                if (i == 0) {
                    maxIndex = i;
                    minIndex = i;
                } else {
                    if (a[maxIndex] < a[i]) {
                        maxIndex = i;
                    }
                    if (a[i] < a[minIndex]) {
                        minIndex = i;
                    }
                }
            }

            for (int j : a) {
                if (j == a[maxIndex]) {
                    maxCount++;
                }
                if (j == a[minIndex]) {
                    minCount++;
                }
            }
            if ((a[maxIndex] == a[minIndex]) || (maxIndex + 1 == minIndex || minIndex + 1 == maxIndex) || (maxCount > 1 || minCount > 1)) {
                rt = 0;
                System.out.println("One or more conditions failed");
            } else {
                rt = 1;
            }
        }
        return rt;
    }

}
