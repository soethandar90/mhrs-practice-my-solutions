package mui.round3;

public class InertialClass {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{11, 4, 20, 9, 2, 8}));//1
        System.out.println(isInertial(new int[]{12, 11, 4, 9, 2, 3, 10}));//0
        System.out.println("--------");
        System.out.println(isInertial(new int[]{1}));//0
        System.out.println(isInertial(new int[]{2}));//0
        System.out.println(isInertial(new int[]{1, 2, 3, 4}));//0
        System.out.println(isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));//1
        System.out.println(isInertial(new int[]{2, 12, 4, 6, 8, 11}));//1
        System.out.println(isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));//1
        System.out.println(isInertial(new int[]{-2, -4, -6, -8, -11}));//0
        System.out.println(isInertial(new int[]{2, 3, 5, 7}));//0
        System.out.println(isInertial(new int[]{2, 4, 6, 8, 10}));//0
    }

    static int isInertial(int[] a) {
        int oddCnt = 0;
        int maxVal = 0;
        int compareEven = 0;
        int maxEven = 0;
        int smallestOdd = 0;

        for (int i : a) {
            if (maxVal == 0) {
                maxVal = i;
            }else{
                if(i>maxVal){
                    maxVal=i;
                }
            }

            if (i % 2 != 0) {
                if (oddCnt == 0) {
                    oddCnt++;
                    smallestOdd = i;
                } else {
                    if (i < smallestOdd) {
                        smallestOdd = i;
                    }
                }
            } else {
                if (maxEven == 0) {
                    maxEven = i;
                } else {
                    if (i > maxEven) {
                        compareEven = maxEven;
                        maxEven = i;
                    }
                }
            }
        }
        if (oddCnt < 1 || maxVal % 2 != 0 || smallestOdd < compareEven) {
            return 0;
        }
        return 1;
    }
}
