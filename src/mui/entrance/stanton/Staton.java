package mui.entrance.stanton;

import java.util.Arrays;
//finding up to last array element.
public class Staton {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{3, 1, 1, 4}; //0
        //int[] inputArr = new int[]{1, 4, 3, 2, 1, 2, 3, 2}; //3
        //int[] inputArr = new int[]{1}; //1
        //int[] inputArr = new int[]{0}; //0
        int[] inputArr = new int[]{1,3,1,1,3,3,2,3,3,3,4}; //0
        System.out.println(statonMeasure(inputArr));
    }

    static int statonMeasure(int[] a) {
        int startNo = 1;
        int cnt = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == startNo) {
                cnt = 0;
                for (int i = 0; i < a.length; i++) {
                    if (startNo == a[i]) {
                        cnt += 1;
                    }
                }
                startNo = cnt;
            }else{
                cnt = 0;
            }
        }
        return cnt;
    }
}


