package mhrs.round1;

public class isCentered15Class {
    public static void main(String[] args) {
        // int[] inputArr = new int[]{1, 1, 13, 1, 1};
        // int[] inputArr = new int[]{1, 1, 12, 1, 1, 1};
        int[] inputArr = new int[]{3, 2, 10, 4, 1, 6, 9}; //1
        //int[] inputArr = new int[]{2, 10, 4, 1, 6, 9}; //0
        //int[] inputArr = new int[]{3, 2, 10, 4, 1, 6}; //0
        //int[] inputArr = new int[]{1,1,8, 3, 1, 1} ; //0
        //int[] inputArr = new int[]{9, 15, 6};//1
        //int[] inputArr = new int[]{1, 1, 2, 2, 1, 1};//0
        //int[] inputArr = new int[]{1, 1, 15 -1,-1}; //1
        //int[] inputArr = new int[]{1, 1}; //0
        //int[] inputArr = new int[]{0}; //0
        System.out.println(isCentered15(inputArr));
    }

    static int isCentered15(int[] a) {
        int rt = 0;
        int len = a.length;
        int result = 0;
        int loopCnt = 0;
        int midPt = 0;
        if (len >= 3) {
            if (len % 2 == 0) {
                loopCnt = 2;
                midPt = (len / 2) - 1;
            } else {
                loopCnt = 1;
                midPt = (len / 2);
            }
            do {
                for (int i = 0; i < loopCnt; i++) {
                    result += a[midPt + i];
                }
                if (result == 15) {
                    rt = 1;
                    break;
                } else if (result > 15) {
                    rt = 0;
                    break;
                } else {
                    result = 0;
                    midPt--;
                    loopCnt += 2;
                }
            } while (midPt > 0);
        } else {
            rt = 0;
            System.out.println("There is no middle element.");
        }
        return rt;
    }
}
