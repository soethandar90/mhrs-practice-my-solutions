package mui.entrance.largestprimefactor;

public class LargestPrime {
    public static void main(String[] args) {
        //int n = 10; //5
        //int n = 6936; //17
        int n = 1; //0
        largestPrimeFactor(n);
    }

    static int largestPrimeFactor(int n) {
        int largestPrime = 0;
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                while (n % i == 0) {
                    if (i >= largestPrime) {
                        largestPrime = i;
                        //System.out.println(largestPrime);
                    }
                    n = n / i;
                }
            }
            if (n > 2) {
                if (n >= largestPrime) {
                    largestPrime = n;
                }
            }
        }
        System.out.println(largestPrime);
        return largestPrime;
    }
}
