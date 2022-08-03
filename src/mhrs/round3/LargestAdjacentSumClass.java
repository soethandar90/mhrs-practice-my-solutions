package mhrs.round3;

public class LargestAdjacentSumClass {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(largestAdjacentSum(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1}));

    }

    static int largestAdjacentSum(int[] a) {
        if (a.length < 2) {
            return -1;
        } else if (a.length == 2) {
            return a[0] + a[1];
        } else {
            int largestAdjSum = a[0] + a[1];
            for (int i = 1; i < a.length - 1; i++) {
                if(a[i]+a[i+1]>largestAdjSum){
                    largestAdjSum = a[i]+a[i+1];
                }
            }
            return largestAdjSum;
        }
    }
}
