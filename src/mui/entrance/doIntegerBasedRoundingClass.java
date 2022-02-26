package mui.entrance;

public class doIntegerBasedRoundingClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 3, 4, 5};int n = 2; //2 2 4 4 6
        //int[] a = new int[]{1, 2, 3, 4, 5};int n = 3; // 0 3 3 3 6
        //int[] a = new int[]{1, 2, 3, 4, 5};int n = -3; // 1 2 3 4 5
        //int[] a = new int[]{-1, -2, -3, -4, -5};int n = 3; // -1 -2 -3 -4 -5
        //int[] a = new int[]{-18, 1, 2, 3, 4, 5};int n = 4; // -18 0 4 4 4 4
        int[] a = new int[]{1, 2, 3, 4, 5};int n = 5; // 0 0 5 5 5
        //int[] a = new int[]{1, 2, 3, 4, 5};int n = 100; // 0 0 0 0 0
        doIntegerBasedRounding(a, n);
    }

    static void doIntegerBasedRounding(int[] a, int n) {
        int i = 0;
        if (n > 0) {
            for (int p : a) {
                if (p > 0) {
                    a[i] = integerRound(p, n);
                }
                i++;
            }
        }
        System.out.println("Result");
        for (int rs : a) {
            System.out.println(rs);
        }
    }

    private static int integerRound(int point, int base) {
        int roundedResult = point;
        int pointRemainder = point % base;
        int halfway = base / 2;
        int baseRemainder = base % 2;
        if (base != point) {
            if ((baseRemainder > 0 && pointRemainder > halfway) || (baseRemainder == 0 && pointRemainder >= halfway)) {
                roundedResult = point + (base - pointRemainder);
            }
            if (baseRemainder > 0 && pointRemainder <= halfway && point > base) {
                roundedResult = point - (point - base);
            }
            if ((baseRemainder > 0 && pointRemainder <= halfway && point <= base) || (baseRemainder == 0 && pointRemainder < halfway)) {
                roundedResult = point - pointRemainder;
            }
        }
        return roundedResult;
    }
}
