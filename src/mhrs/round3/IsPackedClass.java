package mhrs.round3;

public class IsPackedClass {
    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3})); //1
        System.out.println(isPacked(new int[]{2, 3, 2, 3, 3})); //0
        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3})); //0
        System.out.println(isPacked(new int[]{2, 2, 1})); //1
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2})); //0
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3})); //1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1})); //1
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7})); //0
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7})); //1
        System.out.println(isPacked(new int[]{})); //1
        System.out.println(isPacked(new int[]{1, 2, 1})); //0
        System.out.println(isPacked(new int[]{2, 1, 1})); //0
        System.out.println(isPacked(new int[]{-3, -3, -3})); //0
        System.out.println(isPacked(new int[]{0, 2, 2})); //0
        System.out.println(isPacked(new int[]{2, 1, 2})); //0
    }

    static int isPacked(int[] a) {
        if (a.length > 0) {
            int i = 0;
            while (i < a.length) {
                if(a[i]<0){
                    return 0;
                }
                int cnt = 0;
                int val = a[i];
                int lastIndex = i;
                for (int j = i; j < a.length; j++) {
                    if (a[j] == val) {
                        if (j - lastIndex <= 1) {
                            cnt++;
                            lastIndex = j;
                        } else {
                            return 0; //not consecutive
                        }
                    }
                }
                if (cnt != val) {
                    return 0; // n is not n times;
                }
                i += cnt;
            }
        }
        return 1;
    }


}
