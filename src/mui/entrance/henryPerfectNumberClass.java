package mui.entrance;

public class henryPerfectNumberClass {
    static int[] perfectNumCache;

    public static void main(String[] args) {
        int i = 1;
        int j = 3;
        henry(i, j);
    }

    static int henry(int i, int j) {
        int cacheSize = 0;
        int num = 6;
        if (i >= j) {
            cacheSize = i;
        } else {
            cacheSize = j;
        }
        perfectNumCache = new int[cacheSize];
        int count = 0;
        while (count < cacheSize) {
            if (factorSum(num)) {
                perfectNumCache[count] = num;
                count++;
            }
            num++;
        }
        System.out.println(perfectNumCache[i-1]+perfectNumCache[j-1]);
        return perfectNumCache[i-1]+perfectNumCache[j-1];
    }

    static boolean factorSum(int n) {
        int sum = 0;
        for (int k = 1; k <= n / 2; k++) {
            if (n % k == 0) {
                sum += k;
            }
        }
        return n == sum;
    }

}
