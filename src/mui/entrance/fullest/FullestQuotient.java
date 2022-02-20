package mui.entrance.fullest;

public class FullestQuotient {
    public static void main(String[] args) {
        //int n = 94;//6
        //int n = 1;//8
        //int n = 9;//5
        //int n = 360;//0
        int n = -4;//0
        smallest(n);
    }

    static int smallest(int n) {
        int fullnessQuotient;
        if (n > 0) {
            fullnessQuotient = 8;
            for (int base = 2; base <= 9; base++) {
                String rep = "";
                int tempN = n;
                while (tempN > 0) {
                    rep += tempN % base;
                    if (String.valueOf(tempN % 2).contains("0")) {
                        fullnessQuotient--;
                        break;
                    } else {
                        tempN /= base;
                    }
                }
            }
        } else {
            fullnessQuotient = -1;
        }
        System.out.println(fullnessQuotient);
        return fullnessQuotient;
    }
}
