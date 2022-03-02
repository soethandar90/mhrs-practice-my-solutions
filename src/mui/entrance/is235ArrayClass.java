package mui.entrance;

public class is235ArrayClass {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 5, 7, 11}; //1
        //int[] a = new int[]{2, 3, 6, 7, 11}; //0
        //int[] a = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}; //0
        //int[] a = new int[]{2, 4, 8, 16, 32}; //1
        //int[] a = new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}; //1
        //int[] a = new int[]{7, 11, 77, 49}; //1
        //int[] a = new int[]{2}; //1
        //int[] a = new int[]{}; //1
        //int[] a = new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}; //1
        is235Array(a);
    }

    static int is235Array(int[] a) {
        int rt = 0;
        int divisibleByTwo = 0;
        int divisibleByThree = 0;
        int divisibleByFive = 0;
        int nonDivisible = 0;
        for (int n : a) {
            if (n % 2 == 0) {
                divisibleByTwo++;
            }
            if (n % 3 == 0) {
                divisibleByThree++;
            }
            if (n % 5 == 0) {
                divisibleByFive++;
            }
            if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) {
                nonDivisible++;
            }
        }
        if (divisibleByTwo + divisibleByThree + divisibleByFive + nonDivisible == a.length) {
            rt = 1;
        }
        System.out.println(divisibleByTwo);
        System.out.println(divisibleByThree);
        System.out.println(divisibleByFive);
        System.out.println(nonDivisible);
        System.out.println("return " + rt);
        return rt;
    }
}
