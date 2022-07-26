package mui.round3;

public class NextPerfectSquareClass {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }

    static int nextPerfectSquare(int n) {
        if (n >= 0) {
            int i = 0;
            while (i * i <= n) {
                i++;
                if (i * i >= n) {
                    return i * i;
                }
            }
        }
        return 0;
    }
}
