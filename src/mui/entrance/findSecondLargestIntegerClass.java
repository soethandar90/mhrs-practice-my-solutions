package mui.entrance;

public class findSecondLargestIntegerClass {
    public static void main() {
        findSecondLargestInteger(new int[]{1, 2, 3, 4});
        findSecondLargestInteger(new int[]{4, 1, 2, 3});
        findSecondLargestInteger(new int[]{1, 1, 2, 2});
        findSecondLargestInteger(new int[]{1, 1});
        findSecondLargestInteger(new int[]{1});
        findSecondLargestInteger(new int[]{});
    }

    static int findSecondLargestInteger(int[] a) {
        int m1 = -1;
        int m2 = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m1) {
                m2 = m1;
                m1 = a[i];
            } else if (a[i] != m1 && a[i] > m2)
                m2 = a[i];
        }
        return m2;
    }
}


