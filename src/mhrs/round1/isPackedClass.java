package mhrs.round1;

public class isPackedClass {
    public static void main(String[] args) {
        //int[] a = new int[]{2, 2, 3, 3, 3}; //1
        //int[] a = new int[]{2, 3, 2, 3, 3};//0
        //int[] a = new int[]{2, 2, 2, 3, 3, 3};//0
        //int[] a = new int[]{2, 2, 1};//1
        //int[] a = new int[]{2, 2, 1, 2, 2};//0
        //int[] a = new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3};//1
        //int[] a = new int[]{7, 7, 7, 7, 7, 7, 7, 1};//1
        //int[] a = new int[]{7, 7, 7, 7, 1, 7, 7, 7} ;//0
        //int[] a = new int[]{7, 7, 7, 7, 7, 7, 7};//1
        //int[] a = new int[]{};//1
        //int[] a = new int[]{1, 2, 1};//0
        //int[] a = new int[]{2, 1, 1};//0
        //int[] a = new int[]{-3, -3, -3};//0
        //int[] a = new int[]{0, 2, 2};//0
        int[] a = new int[]{2, 1, 2} ;//0
        System.out.println("Return is " + isPacked(a));
    }

    static int isPacked(int[] a) {
        int rt = 1;
        if (a.length > 0) {

            int startIndex = 0;
            do {
                int searchValue = a[startIndex];
                if (startIndex + searchValue > a.length) {
                    rt = 0;
                    System.out.println(searchValue + " does not enough count.");
                    break;
                }
                if(searchValue<=0){
                    rt = 0;
                    System.out.println("Not all values are positive or Zero occurs more than zero time.");
                    break;
                }
                int iCount = 0;
                int searchLoop = a[startIndex];
                int extraCount = 0;
                //search if n item found n time consecutively.
                for (int j = startIndex; j < startIndex + searchValue; j++) {
                    if (a[j] == searchValue) {
                        iCount++;
                    }
                }
                if (iCount < searchValue) {
                    rt = 0;
                    System.out.println(searchValue + " at index " + startIndex + " does not enough count in next consecutive locations.");
                    break;
                }
                for (int j = startIndex + searchValue; j < a.length; j++) {
                    if (a[j] == searchValue) {
                        rt = 0;
                        System.out.println(searchValue + " has extra counts.");
                        break;
                    }
                }
                startIndex += searchValue;

            } while (startIndex < a.length);
        }
        return rt;
    }
}

