package mhrs.round1;

public class isLegalNumberClass {
    public static void main(String[] args) {
        int[] inArray = new int[]{4,2,1}; //1
        int n = 4;//1
        System.out.println(isLegalNumber(inArray,n));
    }

    static int isLegalNumber(int[] a, int n){
        int rt=1;
        for (int i:a) {
            if(i>=n){
                rt=0;
                break;
            }
        }
        return rt;
    }
}
