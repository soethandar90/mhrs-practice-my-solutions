package mui.entrance.cluster;

public class Cluster {
    public static void main(String[] args) {
        //int[] a = new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
        //int[] a = new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        //int[] a = new int[]{18};
        //int[] a = new int[]{-5, -5, -5, -5, -5};
        //int[] a = new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1,1, 1};
        int[] a = new int[]{8, 8, 6, 6, -2, -2, -2};
        clusterCompression(a);
    }

    static int[] clusterCompression(int[] a) {
        int[] result;
        if (a.length > 1) {
            result = new int[]{a[0]};
            for (int i : a) {
                if (result[result.length - 1] != i) {
                    int[] tempA = new int[result.length + 1];
                    for (int j = 0; j < result.length; j++) {
                        tempA[j] = result[j];
                    }
                    tempA[tempA.length - 1] = i;
                    result = tempA;
                }
            }
        }else{
            result=a;
        }
        for (int k : result) {
            System.out.println(k);
        }
        return result;
    }
}
