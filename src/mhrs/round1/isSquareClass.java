package mhrs.round1;

public class isSquareClass {
    public static void main(String[] args) {
        //int n = 0;//1
        int n = 5;//1
        isSquare(n);
    }
//Repeated Subtraction Method of Square Root
    static int isSquare(int n) {
        int rt = 0;
        if(n>0){
        int subOdd = 1;
        int lastSubResult = n;
        int subTime = 0;
        while (lastSubResult > 0) {
            lastSubResult -= subOdd;
            subOdd += 2;
            subTime++;
        }
        if (lastSubResult == 0) {
            rt = 1;
            System.out.println(subTime + " times!");
        }else{
            System.out.println("The square root of "+n+" is not an integer.");
        }
    }else{
            System.out.println("There is no integer that when squared equals "+n);
        }
        return rt;
    }
//
//    static int isSquare(int n) {
//        int rt = 0;
//        int sqr = 0;
//        for (int i = 0; sqr <= n; i++) {
//            sqr = i * i;
//            if (sqr == n) {
//                rt = 1;
//                System.out.println(n + " = " + i + " * " + i);
//                break;
//            }
//        }
//        return rt;
//    }


}
