package mui.entrance.solve10;

public class Solve10_Example {
    static private int TARGET = 10;
    public static void main(String[] args) {
        System.out.println(solve10());
    }

    static int[] solve10() {
        int[] fractorials = new int[TARGET];
        for (int i = 0; i < TARGET; ) {
            fractorials[i] = getFactorial(++i);
        }
        for (int out = 0; out < TARGET - 2; out++) {
            for (int in = out + 1; in < TARGET - 1; in++) {
                if (fractorials[out] + fractorials[1] == fractorials[TARGET - 1]) {
                    return new int[]{out + 1, in + 1};
                }
            }
        }
        return null;
    }

    static int getFactorial(int n) {
        int product = 1;
        for (; n > 0; n--) {
            product *= n;
        }
        return product;
    }
}
