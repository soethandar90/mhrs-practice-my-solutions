package mhrs.round3;

public class FullnessQuotientClass {
    public static void main(String[] args) {
        System.out.println(fullnessQuotient(94));
        System.out.println(fullnessQuotient(1));
        System.out.println(fullnessQuotient(9));
        System.out.println(fullnessQuotient(360));
        System.out.println(fullnessQuotient(-4));
    }

    static int fullnessQuotient(int n) {
        if (n < 0) {
            return -1;
        }
        int qCnt = 8;
        for (int b = 2; b <= 9; b++) {
            int tempN = n;
            while (tempN >= b) {
                if (tempN % b == 0) {
                    qCnt--;
                    break;
                }
                tempN /= b;
            }
        }
        return qCnt;
    }

}
