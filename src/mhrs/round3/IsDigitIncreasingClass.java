package mhrs.round3;

public class IsDigitIncreasingClass {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    static int isDigitIncreasing(int n) {
        int sum = 0;
        int total = 0;
        int i = 1;
        while (i < 10) {
            while (total < n) {
                sum = (sum * 10) + i;
                total += sum;
            }
            if (total == n) {
                return 1;
            }
            i++;
            sum = 0;
            total = 0;
        }
        return 0;
    }
}
