package mui.entrance.repsequal;

import java.util.ArrayList;

public class RepsEqual {

    public static void main(String[] args) {
        //int[] inputArr = new int[]{3, 2, 0, 5, 3}; //1
        //int[] inputArr = new int[]{3, 2, 0, 5}; //0
        //int[] inputArr = new int[]{3, 2, 0, 5, 3, 4}; //0
        //int[] inputArr = new int[]{2, 3, 0, 5, 3}; //0
        //int[] inputArr = new int[]{9, 3, 1, 1, 2}; //0
        int[] inputArr = new int[]{0, 3, 2, 0, 5, 3}; //1
        System.out.println(repsEqual(trimZero(inputArr), 32053));
    }

    static int repsEqual(int[] a, int n) {
        int rt = 0;
        String strNum = Integer.toString(n);
        int nSize = strNum.length();
        if (a.length == nSize) {
            for (int i = 0; i < strNum.length(); i++) {
                if (a[i] == Character.getNumericValue(strNum.charAt(i))) {
                    rt = 1;
                } else {
                    System.out.println("Index " + i + " unmatched. Or, some elements are not in the same order.");
                    rt = 0;
                    break;
                }
            }
        } else {
            System.out.println("The size of the input array is invalid.");
            rt = 0;
        }
        return rt;
    }

    static int[] trimZero(int[] a) {
        if (a[0] == 0) {
            ArrayList<Integer> sanitizedArray = new ArrayList<>();
            for (int i : a) {
                sanitizedArray.add(i);
            }
            while (sanitizedArray.get(0) == 0) {
                sanitizedArray.remove(0);
            }
            return sanitizedArray.stream().mapToInt(i -> i).toArray();
        }
        return a;
    }
}
