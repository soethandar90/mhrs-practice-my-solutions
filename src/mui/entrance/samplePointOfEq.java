package mui.entrance;

public class samplePointOfEq {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}; //2 Reasons
        //int[] a = new int[]{1, 8, 3, 7, 10, 2}; //3 Reasons
        //int[] a = new int[]{2, 1, 1, 1, 2, 1, 7}; //5 Reasons
        //int[] a = new int[]{1, 2, 3}; //-1
        //int[] a = new int[]{3, 4, 5, 10};//-1
        // int[] a = new int[]{1, 2, 10, 3, 4};//-1
        int[] a = new int[]{};//-1
        f(a);
    }

    static int f(int[] a) {
        int rt = -1;
        if (a != null && a.length > 0) {
            int midPoint = a.length / 2;
            int move = 0;
            while (midPoint > 0 || midPoint < a.length) {
                int leftSum = 0;
                int rightSum = 0;
                for (int i = 0; i < midPoint; i++) {
                    leftSum += a[i];
                }
                for (int j = midPoint + 1; j < a.length; j++) {
                    rightSum += a[j];
                }

                if (leftSum == rightSum) {
                    System.out.println("Right " + leftSum);
                    System.out.println("Left " + rightSum);
                    System.out.println("Mid " + midPoint);
                    rt = midPoint;
                    break;
                } else if (leftSum > rightSum) {
                    if (move > 0) {
                        break;
                    }
                    midPoint--;
                    move = -1;
                } else {
                    if (move < 0) {
                        break;
                    }
                    midPoint++;
                    move = 1;
                }
            }
        }
        System.out.println(rt);
        return rt;
    }
}
