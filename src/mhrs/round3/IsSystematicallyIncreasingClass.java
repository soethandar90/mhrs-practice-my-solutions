package mhrs.round3;

public class IsSystematicallyIncreasingClass {
    public static void main(String[] args) {
        System.out.println(isSystematicallyIncreasing(new int[]{1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1}));
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
    }

    static int isSystematicallyIncreasing(int[] a) {
        int n = lenCheck(1, a.length);

        if (a[0] != 1 || a[a.length - 1] != n) {
            return 0;
        }
        if (validDigit(a, a.length - 1, n, n) == -1) {
            return 0;
        }

        return 1;
    }

    private static int lenCheck(int i, int len) {
        if (len > 1) {
            if (i * (i + 1) < 2 * len) {
                return lenCheck(i + 1, len);
            }
            if (i * (i + 1) > 2 * len) {
                return -1;
            }
        }
        return i;
    }

    private static int validDigit(int[] a, int len, int tempN, int n) {
        if (len >= 0) {
            if (tempN == 0) {
                n -= 1;
                tempN = n;
            }
            if (a[len] == tempN) {
                return validDigit(a, len - 1, tempN - 1, n);
            } else {
                return -1;
            }
        }
        return 1;
    }
}


/*
1/2(n(n+1)) = ath seq
Let's say array len is 45.

n(n+1) = 90.
n2 + n - 90 = 0;

1*2=2
2*3=6
3*4=12
4*5=20
5*6=30
6*7=42
7*8=56
8*9=72
9*10=90
10*11=110

(n-9)(n+10) = 0;
n=9; -> Valid array length

Let's say array len is 4.
n(n+1) = 8.
n2 + n - 8 = 0;

1*2=2
2*3=6
3*4=12

Not a valid len.
 */
