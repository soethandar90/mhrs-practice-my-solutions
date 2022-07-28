package mhrs.round3;

public class IsSquareClass {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    static int isSquare(int n) {
        if (n < 0) {
            return 0;
        }
        int sqr = 0;
        while (sqr * sqr < n) {
            sqr++;
        }
        if (sqr * sqr == n) {
            return 1;
        }
        return 0;
    }
}
