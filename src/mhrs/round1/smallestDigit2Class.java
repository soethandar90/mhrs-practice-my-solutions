package mhrs.round1;

public class smallestDigit2Class {
    public static void main(String[] args) {
        //int n = 2; //12
        //int n = 3; //124
        //int n = 4; //624
        //int n = 5; //624
        //int n = 6; //642
        int n = 7; //4062
        smallest(n);
    }

    static int smallest(int n) {
        int smallestNum = 0;
        int tempNum = 0;
        int countOfTwo = 0;
        do {
            smallestNum++;
            if (Integer.toString(smallestNum).contains("2")) {
                countOfTwo = 0;
                for (int i = 1; i <= n; i++) {
                    tempNum = smallestNum * i;
                    while (tempNum > 0) {
                        if (tempNum % 10 == 2) {
                            countOfTwo += 1;
                            break;
                        }
                        tempNum = tempNum / 10;
                    }
                }
            }
        } while (countOfTwo < n);
        System.out.println(smallestNum);
        return smallestNum;
    }
}
