package mhrs.entrance;

public class isHodderClass {
    public static void main(String[] args) {
        //int n = 31; //1
        //int n = 3; //1
        //int n = 7; //1
        //int n = 127; //1
        int n = 128; //0
        isHodder(n);
    }

    static int isHodder(int n) {
        int rt = 1;
        if (n > 0) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    rt = 0;//not prime;
                    break;
                }
            }
            if (rt == 1) {
                rt = 0;
                for (int i = 1; i < n; i++) {
                    int jValue = checkHodderJvalue(i);
                    if (jValue == n) {
                        rt = 1;
                        System.out.println("Hodder J is " + i);
                        break;
                    }
                    if (jValue > n) {
                        break;
                    }
                }
            }
        }
        System.out.println("Return is " + rt);
        return rt;
    }

    static private int checkHodderJvalue(int j) {
        int hodderJvalue = 1;
        for (int i = 1; i <= j; i++) {
            hodderJvalue *= 2;
        }
        return hodderJvalue - 1;
    }
}
