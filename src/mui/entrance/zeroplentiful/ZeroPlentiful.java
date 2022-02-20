package mui.entrance.zeroplentiful;

public class ZeroPlentiful {
    public static void main(String[] args) {
        //int[] a = new int[]{0, 0, 0, 0, 2, 3, 0, 0, 0, 0};//2
        //int[] a = new int[]{1, 0, 0, 0, 2, 3, 6, 0, 0, 0};//0
        //int[] a = new int[]{0, 0, 0, 0, 0};//1
        //int[] a = new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};//2
        //int[] a = new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};//3
        //int[] a = new int[]{1, 2, 3, 4};//0
        //int[] a = new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0};//0
        //int[] a = new int[]{0};//0
        int[] a = new int[]{};//0
        isZeroPlentiful(a);
    }

    static int isZeroPlentiful(int[] a) {
        int totalZeroSequence = 0;
        int startIndex = 0;
        if (a.length >= 4) {
            do {
                if (a[startIndex] == 0) {
                    int seqZeroCount = 0;
                    for (int j = startIndex; j < startIndex + 4; j++) {
                        if (a[j] == 0) {
                            seqZeroCount += 1;
                        } else {
                            startIndex += 1;
                            break;
                        }
                    }
                    if (seqZeroCount == 4) {
                        totalZeroSequence += 1;
                    }
                    startIndex += seqZeroCount;
                } else {
                    startIndex += 1;
                }
            } while (startIndex + 4 <= a.length);
        }

        System.out.println(totalZeroSequence);
        return totalZeroSequence;
    }
}
