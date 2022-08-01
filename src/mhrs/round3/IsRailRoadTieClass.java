package mhrs.round3;

public class IsRailRoadTieClass {
    public static void main(String[] args) {
        System.out.println(isRailroadTie2(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie2(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie2(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie2(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie2(new int[]{1}));
        System.out.println(isRailroadTie2(new int[]{}));
        System.out.println(isRailroadTie2(new int[]{0}));
        System.out.println("----");
        System.out.println(isRailroadTie2(new int[]{1, 2}));
        System.out.println(isRailroadTie2(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie2(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie2(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie2(new int[]{1, 3, 0, 3, 5, 0}));
    }

    static int isRailroadTie(int[] a) {
        if (a.length < 2 || a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == 0) {
                if (a[i - 1] == 0 || a[i + 1] == 0) {
                    return 0;
                }
            } else {
                if ((a[i - 1] == 0 && a[i + 1] == 0) || (a[i - 1] != 0 && a[i + 1] != 0)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    static int isRailroadTie2(int[] a) {
        //1 1 (2 OK
        //1 1 0 1 1 (5 ok
        //1 1 0 1 1 0 1 1 (8 ok
        //1 1 0 1 1 0 1 1 0 1 1 (11 ok
        //1 1 0 1 1 0 1 1 0 1 1 0 1 1 (14 ok
        //3n + 2

        //3n+2 = a
        //3n = a-2
        //n = (a-2)/3
        //if((a-2)%3==0)-> valid len

        int len = a.length;

        if((len-2)%3!=0){
            return 0; //invalid len;
        }

        if(a[0] == 0 || a[len - 1] == 0){
            return 0;
        }
        for(int i=0;i<len;i++){
            if(a[i]==0 && (i+1)%3!=0){
                return 0;
            }
        }
        return 1;
    }
}
