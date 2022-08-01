package mhrs.round3;

public class ClusterCompressionClass {
    public static void main(String[] args) {
        System.out.println(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4}));
        System.out.println(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0}));
        System.out.println(clusterCompression(new int[]{18}));
        System.out.println(clusterCompression(new int[]{}));
        System.out.println(clusterCompression(new int[]{-5, -5, -5, -5, -5}));
        System.out.println(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2}));
    }

    static int[] clusterCompression(int[] a) {
        if (a.length < 1) {
            return new int[]{};
        }
        int val = a[0];
        int[] result = new int[]{val};
        for (int i = 1; i < a.length; i++) {
            if (a[i] != val) {
                val = a[i];
                int[] tempRs = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    tempRs[j] = result[j];
                }
                tempRs[tempRs.length - 1] = val;
                result = tempRs;
            }
        }
        //for (int k : result) {
        //    System.out.println(k);
        //}
        return result;
    }

}
