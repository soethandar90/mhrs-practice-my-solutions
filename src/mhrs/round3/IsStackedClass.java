package mhrs.round3;

public class IsStackedClass {
    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
    }

    static int isStacked(int n) {
        int sum = 0;
        int i = 1;
        while ((sum += i) < n) {
            i++;
        }
        if (sum == n) {
            return 1;
        }
        return 0;
    }
}
