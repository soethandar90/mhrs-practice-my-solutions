package mhrs.entrance;

public class checkConcatenatedSumClass {
    public static void main(String[] args) {
        //int n = 198;int catlen = 2;//1
        //int n = 198;int catlen = 3;//0
        //int n = 2997;int catlen = 3;//1
        //int n = 2997;int catlen = 2;//0
        //int n = 13332;int catlen = 4;//1
        int n = 9;int catlen = 1;//1
        checkConcatenatedSum(n, catlen);
    }

    static int checkConcatenatedSum(int n, int catlen) {
        int rt = 0;
        int result = 0;
        int tempN = n;
        int i = 0;
        while (tempN > 0) {
            i = tempN % 10;
            int tempOriginal = i;
            for (int j = 2; j <= catlen; j++) {
                i *= 10;
                i += tempOriginal;
            }
            result += i;
            tempN /= 10;
        }
        System.out.println(result);
        if (result == n) {
            rt = 1;
        } else {
            rt = 0;
        }
        System.out.println(rt);
        return rt;
    }
}
