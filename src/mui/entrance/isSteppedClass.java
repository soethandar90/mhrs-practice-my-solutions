package mui.entrance;

public class isSteppedClass {
    public static void main(String[] args) {
        isStepped(new int[]{1, 1, 1, 5, 5, 5, 5, 8, 8, 8});
        isStepped(new int[]{1, 1, 5, 5, 5, 5, 8, 8, 8});
        isStepped(new int[]{5, 5, 5, 15});
        isStepped(new int[]{3, 3, 3, 2, 2, 2, 5, 5, 5});
        isStepped(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1});
        isStepped(new int[]{1, 1, 1});
        isStepped(new int[]{1, 1, 1, 1, 1, 1, 1});
    }

    static int isStepped(int[] a) {
        int rt = 1;
        int start = 0;
        int prevNum = 0;
        outerloop:
        while (start <= a.length - 1) {
            if (start > 0 && prevNum > a[start]) {
                rt = 0;
                break;
            }
            int curCount = 0;
            for (int i = 0; i < a.length - start; i++) {
                if (a[start + i] == a[start]) {
                    if (start == a.length - 1) {
                        if (curCount < 3) {
                            rt = 0;
                            break outerloop;
                        }
                    } else {
                        curCount++;
                    }
                } else {
                    if (curCount < 3) {
                        rt = 0;
                        break outerloop;
                    } else {
                        break;
                    }
                }
            }
            prevNum = a[start];
            start += curCount;
        }
        return rt;
    }
}
