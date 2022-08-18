package mhrs.round1;

public class matchesClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{3, -2, 3};//1
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{2, 1, -1, -1, 2, 1};//1
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{1, 2, -1, -1, 1, 2};//1
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{2, 1, -2, 3};//1
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{1, 1, 1, -1, -1, 1, 1, 1};//1
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{4, -1, 3};//0
        //int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{2, -3, 3};//0
        int[] a = new int[]{1, 2, 3, -5, -5, 2, 3, 18};int[] p = new int[]{8};//0
        System.out.println(matches(a, p));
    }
//REVIEW
//    Hint: Your function should have one loop nested in another. The outer loop iterates through the
//    elements of P. The inner loop iterates through the next sequence of A. The upper bound of the
//    inner loop is the absolute value of the current element of P. The lower bound of the inner loop is
//0. The loop variable of the inner loop is not used to index A!
    static int matches(int[] a, int[] p) {
        int rt = 0;

        int startIndex = 0;
        //if (isLegalPattern(a, p) == 1) {
            for (int i : p) {
                int absPcount = Math.abs(i);
                int matchCount = 0;
                for (int j = startIndex; j < (startIndex + absPcount); j++) {
                    if ((i > 0 && a[j] > 0) || (i < 0 && a[j] < 0)) {
                        matchCount += 1;
                    }
                }
                if (matchCount < absPcount) {
                    rt=0;
                    break;
                } else if (matchCount == absPcount) {
                    rt = 1;
                }
                startIndex += absPcount;
            }
       // }
        return rt;
    }

//    static int isLegalPattern(int[] a, int[] p) {
//        int rt = 0;
//        int psum = 0;
//        for (int i : p) {
//            psum += Math.abs(i);
//        }
//        if (a.length == psum) {
//            rt = 1;
//        }
//        return rt;
//    }

}
