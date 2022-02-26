package mui.entrance;

public class isMercurialClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 10, 3, 15, 1, 2, 2}; //0
        //int[] a = new int[]{5, 2, 10, 3, 15, 1, 2, 2}; //1
        //int[] a = new int[]{1, 2, 10, 3, 15, 16, 2, 2}; //1
        //int[] a = new int[]{3, 2, 18, 1, 0, 3, -11, 1, 3}; //0
        //int[] a = new int[]{2, 3, 1, 1, 18}; //1
        //int[] a = new int[]{8, 2, 1, 1, 18, 3, 5}; //1
        //int[] a = new int[]{8, 2, 1, 1, 18, 3, 5}; //1
        //int[] a = new int[]{3, 3, 3, 3, 3, 3}; //1
        //int[] a = new int[]{1};//1
        int[] a = new int[]{};//1
        isMercurial(a);
    }

    static int isMercurial(int[] a) {
        int rt = 1;
        int indexOfBeginOne = -1;
        int indexOfMiddleThree = -1;
        int indexOfEndingOne = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 && indexOfBeginOne < 0 && i != indexOfEndingOne) {
                indexOfBeginOne = i;
            }
            if (a[(a.length - 1) - i] == 1 && indexOfEndingOne < 0 && (a.length - 1) - i != indexOfBeginOne) {
                indexOfEndingOne = (a.length - 1) - i;
            }
            if (indexOfBeginOne != -1 && indexOfEndingOne != -1) {
                if (i > indexOfBeginOne && i < indexOfEndingOne && a[i] == 3) {
                    indexOfMiddleThree = i;
                    rt = 0;
                    break;
                }
            }
        }
        System.out.println("Beginning One(s) : " + indexOfBeginOne);
        System.out.println("Ending One(s) : " + indexOfEndingOne);
        System.out.println("Middle three(s) : " + indexOfMiddleThree);
        System.out.println("Return is " + rt);
        return rt;
    }
}
