package mhrs.entrance;

public class isTriangularClass {
    public static void main(String[] args) {
        //int n = 6;//1
        //int n = 7;//0
        //int n = 10;//1
        //int n = 120;//1
        int n = 121;//0
        isTriangular(n);
    }
/*
    A triangular number represents in the form of an equilateral triangular grid of elements
    such that every subsequent row contains an element more than the previous one.

    List Of Triangular Numbers
    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66,
    78, 91, 105, 120,136, 153, 171, 190, 210,
    231, 253, 276, 300, 325, 351, 378, 406,
    435, 465, 496, 528, 561, 595, 630, 666,
    703, 741, 780, 820, 861, 903, 946, 990,
    1035, 1081, 1128, 1176, 1225, 1275, 1326,
    1378, 1431, and so on.

    Sequence form 1, 1 + 2, 1 + 2 + 3, 1 + 2 + 3 + 4, and so on.
    Formula (n(n+1))/2.
    if n = 3,
    n(n+1) = 12
    n2 + n - 12 = 0
    n2 + n +(-3x4)=0
    (n-3) (n+4)=0
    n = 3 or n = -4
    Since n must be positive,
    the right value of n is 3.

    Code logic:
    - Multiply input n by 2.
    - Loop from count 1 to find two factors of multiplied n that has difference of +1.
    - Recalculate (n(n+1))/2 to validate if latest count resulted from the above loop
    is the same as input n.
    - Return 1 only when the above comparison is true.
 */

    static int isTriangular(int n) {
        int rt = 0;
        int j = 1;
        while (j*(-1) + (2 * n / j) != 1) {
            j++;
        }
        if((j*(j+1))/2==n){
            rt=1;
        }
        return rt;
    }
}
