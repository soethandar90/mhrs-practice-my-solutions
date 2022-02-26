package mui.entrance;

public class getExponentClass {
    public static void main(String[] args) {
        //int n = 162;int p = 3;//4
        //int n = 27;int p = 3;//3
        //int n = 28;int p = 3;//1
        //int n = 280;int p = 7;//1
        //int n = -250;int p = 5;//3
        //int n = 18;int p = -1;//-1
        int n = 128;int p = 4;//3
        getExponent(n, p);
    }

    static int getExponent(int n, int p) {
        int exponent = 0;
        if (p > 1) {
            int divisor;
            do {
                exponent++;
                divisor = 1;
                for (int i = 1; i <= exponent; i++) {
                    divisor *= p;
                }
            } while (n % (divisor * p) == 0);
        } else {
            exponent = -1;
        }
        System.out.println(exponent);
        return exponent;
    }
}
