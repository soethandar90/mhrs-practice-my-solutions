package mhrs.round1;

public class isGuthrieSequenceClass {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{8,4,1}; //0
        //int[] inputArr = new int[]{8,4,2}; //0
        //int[] inputArr = new int[]{8,17,4,1}; //0
        int[] inputArr = new int[]{8,4,2,1}; //1
        System.out.println(isGuthrieSequence(inputArr));
    }

    static int isGuthrieSequence(int[] a) {
        int rt = 0;
       // int curVal = a[0];
        int nextVal = 0;
        int expectedVal = 0;
        if (isValidArray(a)) {
            for(int i=0;i<a.length-1;i++) {
                if (a[i] % 2 == 0) {
                    nextVal = processEven(a[i]);
                } else {
                    nextVal = processOdd(a[i]);
                }
                if(i==a.length-1){
                    expectedVal = a[i];
                }else{
                    expectedVal = a[i+1];
                }
                if(nextVal!=expectedVal){
                    rt=0;
                    break;
                }
                rt = 1;
            }
        }
        return rt;
    }

    static boolean isValidArray(int[] a) {
        return a[a.length - 1] == 1;
    }

    static int processEven(int a) {
        return a / 2;
    }

    static int processOdd(int a) {
        return (a * 3) + 1;
    }

}
