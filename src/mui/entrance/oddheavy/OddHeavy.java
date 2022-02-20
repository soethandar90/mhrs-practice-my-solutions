package mui.entrance.oddheavy;

public class OddHeavy {
    public static void main(String[] args) {
        //int[] a = new int[]{11, 4, 9, 2, 8};//1
        //int[] a = new int[]{1};//1
        //int[] a = new int[]{2};//0
        //int[] a = new int[]{1, 1, 1, 1, 1, 1};//1
        //int[] a = new int[]{2, 4, 6, 8, 11};//1
        int[] a = new int[]{-2, -4, -6, -8, -11};//0
        System.out.println("Return is " + isOddHeavy(a));
    }

    static int isOddHeavy(int[] a) {
        int rt = 0;
        int oddGreaterCnt = 0;
        int oddCount = 0; //total of odd numbers
        for (int i : a) {
            if (i % 2 != 0) {
                oddCount++;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        if (i > a[j]) {
                            oddGreaterCnt++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        if (oddCount>0 && (a.length - oddCount) * oddCount == oddGreaterCnt) {
            rt = 1;
        }
        return rt;
    }
}
