package mhrs.round3;

public class IsMadhavArrayClass {
    public static void main(String[] args){
        System.out.println(isMadhavArray(new int[]{2,1,1}));
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
        System.out.println(isMadhavArray(new int[]{1}));
    }
    static int isMadhavArray(int[] a){
        if(a.length==1){
            return 1;
        }

        if(a.length>1){
            int i=0;
            boolean validLen=false;
            while(i*(i+1)<=(a.length)*2){
                if(i*(i+1)==(a.length)*2){
                    validLen=true;
                    break;
                }
                i++;
            }
            if(validLen){
                int start=1;
                int seq=1;
                while(start<a.length){
                    seq++;
                    int sum=0;
                    for(int j=0;j<seq;j++){
                        sum += a[start+j];
                    }
                    if(a[0]!=sum){
                        return 0;
                    }
                    start += seq;
                }
                return 1;
            }
        }
        return 0;
    }
}