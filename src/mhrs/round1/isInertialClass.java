package mhrs.round1;

/*
 * At least one odd value
 * Max value is even
 * Odd > Even values > Max
 * */

import java.util.ArrayList;
import java.util.List;

public class isInertialClass {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{1}; //0
        //int[] inputArr = new int[]{2}; //0
        //int[] inputArr = new int[]{1,2,3,4}; //0
        //int[] inputArr = new int[]{1,1,1,1,1,1,2}; //1
        //int[] inputArr = new int[]{2,12,4,6,8,11}; //1
        //int[] inputArr = new int[]{2,12,12,4,6,8,11}; //1
        //int[] inputArr = new int[]{-2,-4,-6,-8,-11}; //0
        //int[] inputArr = new int[]{2,3,5,7}; //0
        int[] inputArr = new int[]{2,4,6,8,10}; //0
        System.out.println(isInertial(inputArr));
    }

    static int isInertial(int[] a) {
        int rt = 0;
        boolean checkOneOdd = false;
        boolean checkMaxEven = false;
        boolean checkOddGtEven = false;
        int maxVal = a[0];
        int greatOddCnt = 0;
        boolean compare = true;

//Check if there is at least one odd number.
        for (int i : a) {
            if (i % 2 != 0) {
                checkOneOdd = true;
                break;
            }
        }

//Check if maximum value is even number.
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxVal) {
                maxVal = a[i];
            }
        }
        if (maxVal % 2 == 0) {
            checkMaxEven = true;
        }

//Check if all Odd number are greater than even (not max)
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int i : a) {
            if (i % 2 == 0 && i != maxVal) {
                evenList.add(i);
            } else if (i % 2 != 0&& i != maxVal){
                oddList.add(i);
            }
        }
        for (int oddNum : oddList) {
            if (compare) {
                for (int evenNum : evenList) {
                    if (oddNum > evenNum) {
                        System.out.println(oddNum + " > " + evenNum);
                    } else {
                        compare = false;
                        checkOddGtEven = false;
                        break;
                    }
                    checkOddGtEven = true;
                }
            } else {
                break;
            }
        }

//return 1 if all conditions met.
        if (checkOneOdd && checkMaxEven && checkOddGtEven) {
            rt = 1;
        }
        return rt;
    }
}