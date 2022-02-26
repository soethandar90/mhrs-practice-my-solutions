package mui.entrance;

//finding up to last array element.
public class stantonMeasureClass {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{3, 1, 1, 4}; //0
        //int[] inputArr = new int[]{1, 4, 3, 2, 1, 2, 3, 2}; //3
        //int[] inputArr = new int[]{1}; //1
        //int[] inputArr = new int[]{0}; //1
        int[] inputArr = new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}; //6
        System.out.println(stantonMeasure(inputArr));
    }

    static int stantonMeasure(int[] a) {
        int n = 0;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==1) {
                cnt += 1;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j]==cnt) {
                 n+=1;
            }
        }
        return n;
    }
}


