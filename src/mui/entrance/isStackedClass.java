package mui.entrance;

public class isStackedClass {
    public static void main(String[] args) {
        //int n = 1; //1
        //int n = 3; //1
        //int n = 6; //1
        //int n = 10; //1
        //int n = 15; //1
        //int n = 7; //0
        //int n = 8; //0
        int n = 9; //0
        System.out.println("Returned " + isStacked(n));
    }

    static int isStacked(int n) {
        int rt = 0;
        if (n > 0) {
            int sum = 0;
            int posInt = 1;
            while (n > sum) {
                sum += posInt;
                posInt++;
            }
            if (n == sum) {
                rt = 1;
            }

        }
        return rt;
    }
}
