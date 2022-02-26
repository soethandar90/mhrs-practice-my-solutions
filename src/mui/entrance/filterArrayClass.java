package mui.entrance;

public class filterArrayClass {
    public static void main(String[] args) {
        //int[] a = new int[]{8, 4, 9, 0, 3, 1, 2};int n = 88; //0,3,2
        //int[] a = new int[]{9,-9};int n = 0; //{}
        //int[] a = new int[]{9,-9};int n = 1; //9
        //int[] a = new int[]{9,-9};int n = 2; //-9
        //int[] a = new int[]{9,-9};int n = 3; //9,-9
        //int[] a = new int[]{9, -9};int n = 4; //null
        //int[] a = new int[]{9, -9, 5};int n = 3; //9,-9
        int[] a = new int[]{0, 9, 12, 18, -6};int n = 11; //0,9,8
        filterArray(a, n);
    }

    static int[] filterArray(int[] a, int n) {
        int tempN = n;
        String rep = "";
        int[] result = new int[0];
        while (tempN > 0) {
            rep += tempN % 2;
            if (String.valueOf(tempN % 2).contains("1")) {
                int[] tempResult = new int[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tempResult[i] = result[i];
                }
                if (rep.lastIndexOf("1") >= a.length) {
                    result = null;
                    break;
                } else {
                    tempResult[tempResult.length - 1] = a[rep.lastIndexOf("1")];
                    result = tempResult;
                }
            }
            tempN /= 2;
        }
//        if(result!=null) {
//            for (int k : result) {
//                System.out.println(k);
//            }
//        }
        return result;
    }
}
