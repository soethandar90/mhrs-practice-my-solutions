package mui.entrance;

public class isOneBalancedClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 1, 1, 2, 3, -18, 45, 1}; //1
        //int[] a = new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0};//0
       // int[] a = new int[]{1, 1, 2, 3, 1, -18, 26, 1};//0
        //int[] a = new int[]{};//1
        //int[] a = new int[]{3, 4, 1, 1};//1
        //int[] a = new int[]{1, 1, 3, 4};//1
        //int[] a = new int[]{3, 3, 3, 3, 3, 3};//0
        int[] a = new int[]{1, 1, 1, 1, 1, 1};//0
        isOneBalanced(a);
    }

    static int isOneBalanced(int[] a) {
        int rt = 1;
        int lastIndex = a.length - 1;
        int beginCount = 0;
        int endingCount = 0;
        if (a.length > 0) {
            if (a[0] <= 1 || a[lastIndex] == 1) {
                for (int i = 0; i < lastIndex; i++) {
                    if (beginCount == i && a[i] < 2) {
                        beginCount++;
                    }
                    if (endingCount == i && a[lastIndex - i] == 1) {
                        endingCount++;
                    }
                }
                if (lastIndex + 1 == 2 * (beginCount + endingCount)) {
                    for (int j = beginCount; j <= lastIndex - endingCount; j++) {
                        if (a[j] == 1 || a[j] == 0) {
                            System.out.println("There are 0 or 1 in the midde of sequence. (More than one sequence.)");
                            rt = 0;
                            break;
                        }
                    }
                } else {
                    System.out.println("Begin Count + Ending Count != Length");
                    rt = 0;
                }
            } else {
                System.out.println("Does not start with 0 or 1 <OR> does not end with 1.");
                rt = 0;
            }
        }
        System.out.println("Length is " + (lastIndex + 1));
        System.out.println("BeginCount is " + beginCount);
        System.out.println("EndingCount is " + endingCount);

        System.out.println(rt);
        return rt;
    }
}
