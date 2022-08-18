package mhrs.round1;

public class isMartianClass {
    public static void main(String[] args) {
        //int[] a = new int[]{1, 3}; //1
        //int[] a = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}; //1
        //int[] a = new int[]{1, 3, 2}; //0
        //int[] a = new int[]{1, 3, 2, 2, 1, 5, 1, 5}; //0
        //int[] a = new int[]{1, 2, -18, -18, 1, 2}; //0
        //int[] a = new int[]{}; //0
        //int[] a = new int[]{1}; //1
        int[] a = new int[]{2}; //0
        isMartian(a);
    }

    static int isMartian(int[] a) {
        int rt = 1;
        int countOfOnes = 0;
        int countOfTwos = 0;
        int i = 0;
        while (i < a.length) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                rt = 0;
                System.out.println("Break out!");
                break;
            }
            if (a[i] == 1) {
                countOfOnes++;
            }
            if (a[i] == 2) {
                countOfTwos++;
            }
            i++;
        }
        if (rt == 1 && countOfTwos >= countOfOnes) {
            rt = 0;
        }

        System.out.println("Count 1s " + countOfOnes);
        System.out.println("Count 2s " + countOfTwos);
        System.out.println("Return is " + rt);
        return rt;
    }
}
