package mui.entrance.digitincreasing;

public class DigitIncreasing {
    public static void main(String[] args) {
        //int n = 36;//1
        //int n = 7;//1
        //int n = 984;//1
        //int n = 7404;//1
        int n=7403;//0
        isDigitIncreasing(n);
    }

    static int isDigitIncreasing(int n) {
        int rt = 0;
        if (n > 9) {
            for (int i = 1; i <= 9; i++) {
                int total = i;
                int tempN = i;
                while (total < n) {
                    tempN *= 10;
                    tempN += i;
                    total += tempN;
                }
                if (total == n) {
                    rt = 1;
                    break;
                }
            }
        } else if (n > 0 && n < 10) {
            rt = 1;
        }
        System.out.println(rt);
        return rt;
    }
}
