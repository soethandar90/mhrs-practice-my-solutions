package mui.entrance.sequentially;

public class SequentiallyBounded {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{2, 3, 3, 99, 99, 99, 99, 99}; //1
        //int[] inputArr = new int[]{2, 3, -3, 99, 99, 99, 99, 99}; //0
        //int[] inputArr = new int[] {1, 2, 3}; //0
        //int[] inputArr = new int[]{2, 3, 3, 3, 3}; //0
        //int[] inputArr = new int[]{12, 12, 9}; //0
        //int[] inputArr = new int[]{0, 1}; //0
        //int[] inputArr = new int[]{-1, 2}; //0
        int[] inputArr = new int[]{5, 5, 5, 5}; //1
        //int[] inputArr = new int[]{5, 5, 5, 2, 5};//0
        System.out.println(isSequentiallyBounded(inputArr));
    }

    static int isSequentiallyBounded(int[] a) {
        int rt = 1;
        int previousElement = a[0];
        if (a.length != 0) {
            for (int i : a) {
                if (i >= previousElement && i > 0) {
                    int occurance = 0;
                    for (int j : a) {
                        if (i == j) {
                            occurance += 1;
                        }
                    }
                    if (occurance >= i) {
                        rt = 0;
                        break;
                    }
                    previousElement = i;
                } else {
                    rt = 0;
                    break;
                }
            }
        }
        return rt;
    }
}
