package mhrs.round1;

import java.util.ArrayList;
import java.util.List;

public class isMadhavArrayClass {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{2,1,1}; //1
        //int[] inputArr = new int[]{2,1,1,4,-1,-1}; //1
        //int[] inputArr = new int[]{6,2,4,2,2,2,1,5,0,0}; //1
        //int[] inputArr = new int[]{18,9,10,6,6,6}; //0
        //int[] inputArr = new int[]{-6,-3,-3,8,-5,-4}; //0
        //int[] inputArr = new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}; //1
        //int[] inputArr = new int[]{3, 1, 2, 3, 0}; //0
        int[] inputArr = new int[]{3}; //0
        System.out.println(isMadhavArray(inputArr));
    }

    static int isMadhavArray(int[] a) {
        int flag = 0;
        int n = 1;
        int calValue = 0;
        if (checkLength(a.length)) {
            for (int i = 1; i <= a.length; i++) {
                int strIndex = i * (i + 1) / 2;
                if (strIndex < a.length) {
                    for (int j = strIndex; j <= (strIndex + n); j++) {
                        calValue += a[j];
                    }
                    if (a[0] == calValue) {
                        flag = 1;
                        n += 1;
                        calValue = 0; //reset the value
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }
        } else {
            flag = 0;
        }
        return flag;
    }

    static boolean checkLength(int b) {
        int newLen = b * 2; //n(n+1)/2 => n2 + n - (newLen*2)
        boolean valid = false;
        List<Integer> posFt = new ArrayList<>();
        List<Integer> negFt = new ArrayList<>();
        for (int i = 1; i <= newLen; i++) {
            if (newLen % i == 0) {
                posFt.add(i);
            }
        }
        for (int j = (posFt.size() - 1); j >= 0; j--) {
            negFt.add(posFt.get(j) * (-1));
        }
        for (int c = 0; c <= negFt.size() - 1; c++) {
            if (negFt.get(c) + posFt.get(c) == 1) {
                System.out.println("Array length is valid.");
                valid = true;
                break;
            }
        }
        return valid;
    }
}

