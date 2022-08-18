package mhrs.round1;

import java.util.ArrayList;
import java.util.List;

public class isTrivalentClass {
    public static void main(String[] args) {
        //int[] inArray = new int[]{22, 19, 10, 10, 19, 22, 22, 10};//1
        //int[] inArray = new int[]{1, 2, 2, 2, 2, 2, 2};//0
        //int[] inArray = new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65};//0
        //int[] inArray = new int[]{-1, 0, 1, 0, 0, 0};//1
        //int[] inArray = new int[]{};//0
        //int[] inArray = new int[]{ 2147483647, -1, -1,-2147483648};//1
        int[] inArray = new int[]{1,3,4,1,5,4};//1
        System.out.println("Returned " + isTrivalent(inArray));
    }

    static int isTrivalent(int[] a) {
        int rt = 0;
        if (a.length != 0) {
            List<Integer> uniqueElement = new ArrayList<>();
            for (int i : a) {
                if (!uniqueElement.contains(i)) {
                    uniqueElement.add(i);
                }
                if (uniqueElement.size() > 3) {
                   rt=0;
                   break;
                }
            }
            if (uniqueElement.size() == 3) {
                rt = 1;
            }
        }
        return rt;
    }
}
