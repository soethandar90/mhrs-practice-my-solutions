package mui.entrance.array121;

public class Array121 {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 1, 2, 2, 2, 1, 1};//1
        //int[] a = new int[]{1, 1, 2, 1, 2, 1, 1};//0
        //int[] a = new int[]{1, 1, 2, 3, 2, 1, 1};//0
        //int[] a = new int[]{1, 2, 2, 2, 2, 1, 1};//0
        //int[] a = new int[]{1, 1, 2, 2, 1, 1, 1};//0
        //int[] a = new int[]{2, 1, 2, 2, 1, 1, 1};//0
        //int[] a = new int[]{1, 2, 1};//1
        //int[] a = new int[]{1, 1, 2, 2, 2, 1, 1};//1
        //int[] a = new int[]{1, 1, 2, 2, 2, 1, 1, 1};//0
        //int[] a = new int[]{1, 1, 2, 1, 2, 1, 1};//0
        //int[] a = new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1,3};//0
        //int[] a = new int[]{1, 1, 1, 1, 1, 1};//0
        //int[] a = new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};//0
        //int[] a = new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2};//0
        //int[] a = new int[]{2, 2, 2};//0
        int[] a = new int[]{};//0
        is121Array(a);
    }

    static int is121Array(int[] a) {
        int rt = 0;
        if (a.length > 0) {
            if (a[0] == 1 && a[a.length - 1] == 1) {
                rt = 1;
                int midNum = 1;
                int midIndex = a.length / 2;
                int countOfOne = a.length;
                if (midIndex > 1) {
                    for (int i = 1; i < midIndex; i++) {
                        if (a[i] != a[(a.length - 1) - i]) {
                            rt = 0;
                            break;
                        } else {
                            if (a[i] < midNum) {
                                rt = 0;
                                break;
                            } else if (a[i] >= midNum && a[i] < 3) {
                                rt = 1;
                                midNum = a[i];
                                if (midNum == 2) {
                                    countOfOne -= 2;
                                }
                                System.out.println(midNum);
                            }
                        }
                    }
                }
                if (midIndex % 2 != 0 && rt == 1) {
                    if (a[midIndex] > 2) {
                        rt = 0;
                    } else if (a[midIndex] < midNum) {
                        rt = 0;
                    } else if (a[midIndex] >= midNum) {
                        rt = 1;
                        if (a[midIndex] == 2) {
                            countOfOne -= 1;
                        }
                    }
                }
                if (countOfOne == a.length && rt == 1) {
                    rt = 0;
                    System.out.println("There is no 2.");
                }
            }
        }
        System.out.println("Return is " + rt);
        return rt;
    }
}
