package mhrs.round3;

public class HenryPerfectNumberClass {
    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }

    static int henry(int i, int j) {
        return findNthFactoSum(i) + findNthFactoSum(3);
    }

    static int findNthFactoSum(int k) {
        int sum = 0;
        int n = 1;
        while (k > 0) {
            sum = 0;
            int end = n / 2;
            for (int i = 1; i <= end; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                k--;
            }
            n++;
        }
        return sum;
    }
}
