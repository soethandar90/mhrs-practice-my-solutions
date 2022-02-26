package mui.entrance;

public class isRailroadTieClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 0, 3, -18, 0, 2, 2};//1
        //int[] a = new int[]{1, 2, 3, 0, 2, 2};//0
        //int[] a = new int[]{0, 1, 2, 0, 3, 4};//0
        //int[] a = new int[]{1, 2, 0, 0, 3, 4};//0
        //int[] a = new int[]{1};//0
        //int[] a = new int[]{0};//0
        //int[] a = new int[]{1,2};//1
        //int[] a = new int[]{1, 2, 0, 1, 2, 0, 1, 2};//1
        //int[] a= new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3};//1
        //int[] a= new int[]{0, 0, 0, 0};//0
        //int[] a= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10};//0
        int[] a= new int[]{1, 3, 0, 3, 5, 0};//0
        isRailroadTie(a);
    }

    static int isRailroadTie(int[] a) {
        int rt = 1;
        if (a.length > 1) {
            if (a[0] == 0 || a[a.length - 1] == 0) {
                rt = 0;
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (i == 0) {
                        if (a[i + 1] == 0) {
                            rt = 0;
                            break;
                        }
                    } else if (i == a.length - 1) {
                        if (a[i - 1] == 0) {
                            rt = 0;
                            break;
                        }
                    } else {
                        if (a[i] == 0) {
                            if (a[i - 1] == 0 || a[i + 1] == 0) {
                                rt = 0;
                                break;
                            }
                        } else {
                            if (a[i - 1] != 0 && a[i + 1] != 0) {
                                rt = 0;
                                break;
                            }

                        }
                    }
                }
            }
        }else{
            rt=0;
        }
        System.out.println(rt);
        return rt;
    }
}
