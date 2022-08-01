package mhrs.round3;

public class SmallestClass {
    public static void main(String[] args) {
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    static int smallest(int n) {
        int i = 0;
        int twoExist = 0;
        while (n > twoExist) {
            i++;
            twoExist = 0;
            for (int j = 1; j <= n; j++) {
                int k = i * j;
                while (k > 0) {
                    if (k % 10 == 2) {
                        twoExist++;
                        break;
                    }
                    k /= 10;
                }
            }
        }
        return i;
    }
}
