package mui.entrance.vanilla;

public class Vanilla {
    public static void main(String[] args) {
        //int[] inArray = new int[] {1, 1, 11, 1111, 1111111}; //1
        //int[] inArray = new int[] {11, 101, 1111, 11111} ; //0
        //int[] inArray = new int[]{1};//1
        //int[] inArray = new int[]{11, 22, 13, 34, 125};//0
        int[] inArray = new int[]{9, 999, 99999, -9999};//1
        isVanilla(inArray);
    }

    static int isVanilla(int[] a) {
        int rt = 0;
        if (a.length != 0) {
            int firstDigit = Integer.parseInt(Integer.toString(a[0]).substring(0, 1));
            for (int i : a) {
                int elementLength = Integer.toString(Math.abs(i)).length();
                String expectedValue = "";
                for (int j = 1; j <= elementLength; j++) {
                    expectedValue = expectedValue.concat(String.valueOf(firstDigit));
                }
                if (Math.abs(i) != Integer.parseInt(expectedValue)) {
                    rt = 0;
                    break;
                } else {
                    rt = 1;
                }
            }
        } else {
            rt = 1;
        }
        System.out.println(rt);
        return rt;
    }
}
