package mui.entrance;

public class countSquarePairsClass {
    public static void main(String[] args) {
        //int[] inputArr = new int[]{11, 5, 4, 20}; //3
        int[] inputArr = new int[]{9, 0, 2, -5, 7}; //2
        System.out.println(countSquarePairs(inputArr));
    }

    static int countSquarePairs(int[] a) {
        int pairCnt = 0;
        if (a.length > 1) {
            for (int curVal : a) {
                for (int i = 0; i < a.length; i++) {
                    if (curVal < a[i] && curVal > 0) {
                        double result = curVal + a[i];
                        if (Math.sqrt(result) == Math.floor(Math.sqrt(result))) {
                            System.out.println("<" + curVal + "," + a[i] + ">");
                            pairCnt += 1;
                        }
                    }
                }
            }
        } else {
            pairCnt = 0;
            System.out.println("The array must have at least 2 elements.");
        }
        return pairCnt;
    }
}
