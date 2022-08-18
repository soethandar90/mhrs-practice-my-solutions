package mhrs.round1;

public class fullnessQuotientClass {
    public static void main(String[] args) {
        //int n = 94;//6
        //int n = 1;//8
        //int n = 9;//5
        //int n = 360;//0
        int n = -4;//-1
        fullnessQuotient(n);
    }

    static int fullnessQuotient(int n) {
        int fullQuotient;
        if (n > 0) {
            fullQuotient = 8;
            for (int base = 2; base <= 9; base++) {
                String rep = "";
                int tempN = n;
                while (tempN > 0) {
                    rep += tempN % base;
                    if (String.valueOf(tempN % 2).contains("0")) {
                        fullQuotient--;
                        break;
                    } else {
                        tempN /= base;
                    }
                }
            }
        } else {
            fullQuotient = -1;
        }
        System.out.println(fullQuotient);
        return fullQuotient;
    }
}
