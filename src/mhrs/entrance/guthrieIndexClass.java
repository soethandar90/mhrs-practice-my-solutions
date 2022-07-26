package mhrs.entrance;

public class guthrieIndexClass {
    public static void main(String[] args) {
        //int num = 1; //0
        //int num = 2; //1
        //int num = 3; //7
        //int num = 4; //2
        int num = 42; //8
        System.out.println(guthrieIndex(num));
    }

    static int guthrieIndex(int n) {
        int itr = 0;
        if (n > 1) {
            do {
                itr += 1;
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = (n * 3) + 1;
                }
            } while (n != 1);
        }
        return itr;
    }
}
