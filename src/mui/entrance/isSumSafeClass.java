package mui.entrance;

import java.util.Arrays;

public class isSumSafeClass {
    public static void main(String[] args) {
        //int[] inArray = new int[]{5, -5, 0}; //0
        int[] inArray = new int[] {5, -2, 1} ; //1
        //int[] inArray = new int[]{}; //0
        System.out.println("Returned " + isSumSafe(inArray));
    }

    static int isSumSafe(int[] a) {
        int rt = 0;
        if (a.length != 0) {
            if (!Arrays.stream(a).anyMatch(x -> x == Arrays.stream(a).sum())) {
                rt = 1;
            }
        }
        return rt;
    }

    //Without stream
    static int isSumSafe2(int[] a) {
        int rt = 1;
        if (a != null || a.length != 0) {
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            for (int j : a) {
                if (j == sum) {
                    rt = 0;
                    break;
                }
            }
        }
        return rt;
    }

}
