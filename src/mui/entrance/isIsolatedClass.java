package mui.entrance;

public class isIsolatedClass {
    public static void main(String[] args) {
        //Long inLong = 163L; //1
        //Long inLong = 162L; //0
        Long inLong = -2L; //0
        System.out.println(isIsolated(inLong));
    }

    static int isIsolated(long n) {
        int rt = 1;
        long squareValue = n * n;
        long cubeValue = n * n * n;
        String stringSquare = String.valueOf(squareValue);
        if (n > 2097151L || n < 1) {
            rt = -1;
        } else {
            while (cubeValue != 0) {
                long searchDigit = cubeValue % 10;
                if (stringSquare.contains(String.valueOf(searchDigit))) {
                    rt = 0;
                    break;
                }
                cubeValue /= 10;
            }
        }
        return rt;
    }
}
