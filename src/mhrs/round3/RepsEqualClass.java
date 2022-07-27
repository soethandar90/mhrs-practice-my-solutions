package mhrs.round3;

public class RepsEqualClass {
    public static void main(String[] args){
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }
    static int repsEqual(int[] a, int n){
        int arrayLen=a.length;
        int endIndex = 0;
        if(a[0]==0){
            arrayLen -= 1;
            endIndex += 1;
        }
        if(arrayLen!=(int)Math.log10(n)+1){
            return 0;
        }

        for(int i=a.length-1;i>=endIndex;i--){
            if(a[i]!=n%10){
                return 0;
            }
            n = n/10;
        }
        return 1;
    }
}
