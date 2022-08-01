package mhrs.round3;

public class IsSequentiallyBoundedClass {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0,1}));
        System.out.println(isSequentiallyBounded(new int[]{-1,2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5,5,5,5}));
        System.out.println(isSequentiallyBounded(new int[]{5,5,5,2,5}));
    }

    static int isSequentiallyBounded(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
            if(a[i]<=0){
                return 0;
            }
            int cnt = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    cnt++;
                }
            }
            if (cnt >= a[i]) {
                return 0;
            }
        }
        return 1;
    }
}
