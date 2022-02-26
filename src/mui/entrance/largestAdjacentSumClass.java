package mui.entrance;

public class largestAdjacentSumClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 3, 4};//7
        //int[] a = new int[]{18, -12, 9, -10};//6
        //int[] a = new int[]{1,1,1,1,1,1,1,1,1};//2
        int[] a = new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1};//3
        System.out.println(largestAdjacentSum(a));
    }

    static int largestAdjacentSum(int[] a) {
        int largestAjSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] >= largestAjSum) {
                largestAjSum = a[i] + a[i + 1];
            }
        }
        return largestAjSum;
    }
}
