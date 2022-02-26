package mui.entrance;

public class decodeArrayNzeroClass {
    public static void main(String[] args) {
        //int[] a = new int[]{0, 1, 0, 0, 1, 0, 0, 1}; //122
        //int[] a = new int[]{0, 1}; //1
        //int[] a = new int[]{-1, 0, 1}; //1
        //int[] a= new int[]{0, 1, 1, 1, 1, 1, 0, 1}; //100001
        int[] a= new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}; //999
        decodeArray(a);
    }

    static int decodeArray(int[] a) {
        int decodedNum = 0;
        int currentIndex = 0;
        int startIndex=0;
        int zeroCount = 0;
        boolean negativeNum = false;
        String strDecodedNum = "";
        while (currentIndex < a.length) {
            if (a[currentIndex] == 0) {
                zeroCount++;
                if (a[currentIndex + 1] == 1) {
                    strDecodedNum += String.valueOf(zeroCount);
                    currentIndex += 1;
                    zeroCount = 0;
                } else if (a[currentIndex + 1] == 0) {
                    currentIndex += 1;
                }
            } else if (a[currentIndex] == 1) {
                if (currentIndex != 0 && a[currentIndex - 1] == 1) {
                    strDecodedNum += String.valueOf(zeroCount);
                }
                currentIndex += 1;
            } else if (currentIndex == 0 && a[currentIndex] == -1) {
                negativeNum = true;
                currentIndex += 1;
            } else {
                break;
            }
        }
        if (strDecodedNum != "") {
            decodedNum = Integer.parseInt(strDecodedNum);
            if (negativeNum) {
                decodedNum *= -1;
            }
        }


        System.out.println(decodedNum);
        return decodedNum;
    }
}
