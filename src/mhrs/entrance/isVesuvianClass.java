package mhrs.entrance;

public class isVesuvianClass {
    public static void main(String[] args) {
        int n = 85; //1
        //int n = 65; //1
        //int n = 50; //1
        //int n = 10; //0
        isVesuvian(n);
    }

    static int isVesuvian(int n) {
        int rt = 0;
        int pair = 0;
        for (int i = 1; i <= n / 2; i++) {
            double sqrt1 = Math.sqrt(i);
            double sqrt2 = Math.sqrt(n - i);
            double ceil1 = Math.ceil(sqrt1);
            double ceil2 = Math.ceil(sqrt2);
            if (sqrt1 == ceil1 && sqrt2 == ceil2) {
                System.out.println(i + ", " + (n - i));
                pair++;
            }
        }
        if (pair > 1) {
            rt = 1;
        }
        return rt;
    }
}
