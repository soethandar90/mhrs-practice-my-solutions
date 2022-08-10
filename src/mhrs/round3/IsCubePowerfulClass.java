package mhrs.round3;

public class IsCubePowerfulClass {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    static int isCubePowerful(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        int tempN = n;
        while (tempN > 0) {
            sum = sum + (int) Math.pow(tempN % 10, 3);
            tempN = tempN / 10;
            if (sum > n) {
                return 0;
            }
        }
        if (sum != n) {
            return 0;
        }
        return 1;
    }

}
