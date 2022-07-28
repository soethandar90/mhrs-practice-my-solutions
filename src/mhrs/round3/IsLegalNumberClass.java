package mhrs.round3;

public class IsLegalNumberClass {
    public static void main(String[] args) {
        System.out.println(isLeagalNumber(new int[]{1, 0, 1, 1}, 2)); //11
        System.out.println(isLeagalNumber(new int[]{1, 1, 2}, 3)); //14
        System.out.println(isLeagalNumber(new int[]{3, 2, 5}, 8)); //213
        System.out.println(isLeagalNumber(new int[]{3, 2, 1}, 4)); //213
        System.out.println(isLeagalNumber(new int[] {3, 7, 1}, 6));

    }

    static int isLeagalNumber(int[] a, int base) {
        int n = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            if(a[i]>=base){
                return 0;
            }
            int m = 1;
            for (int j = 1; j <= (a.length - 1) - i; j++) {
                m *= base;
            }
            n += a[i] * m;
        }
        return 1;
    }
}
