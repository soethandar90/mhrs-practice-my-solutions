package mui.entrance;

public class allEvenClass {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6};
        allEven(a);
    }

    static int allEven(int[] a) {
        int rt = 1;
        for (int n : a) {
            if (n % 2 == 1) {
                rt = 0;
                break;
            }
        }
        return rt;
    }
}
