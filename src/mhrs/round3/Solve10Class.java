package mhrs.round3;

public class Solve10Class {
    public static void main(String[] args) {
        solve10();
    }

    static int[] solve10() {
        int n = 2;
        for (int i = n - 1; i >= 1; i--) {
            int f = findFacto(i);
            int fn = findFacto(n);
            if (f + f < fn) {
                int x = i + 1;
                if (x == n) {
                    return new int[2];
                } else {
                    for (int y = i; y >= 1; y--) {
                        if (findFacto(x) + findFacto(y) == n) {
                            return new int[]{x, y};
                        }
                    }
                }
            } else if (f + f == fn) {
                return new int[]{i, i};
            }
        }
        return new int[2];
    }

    static int findFacto(int n) {
        int f = 1;
        for (int i = n; i > 1; i--) {
            f *= i;
        }
        return f;
    }
}
