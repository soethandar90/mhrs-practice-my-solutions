package mhrs.round3;

public class AreAnagramsClass {
    public static void main(String[] args){
        System.out.println(areAnagrams(new char[]{'p', 'o', 'l', 'l'}, new char[]{'p', 'o', 'o', 'l'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }
    static int areAnagrams(char[] a1, char[] a2){
        if(a1.length!=a2.length){
            return 0;
        }

        for(int i=0;i<a1.length;i++){
            int a1Cnt=1;
            for(int j=i+1;j< a1.length-1;j++){
                if(a1[i]==a1[j]){
                    a1Cnt+=1;
                }
            }
            int a2Cnt=0;
            for(int k:a2){
                if(a1[i]==k){
                    a2Cnt+=1;
                }
            }
            if(a1Cnt!=a2Cnt){
                return 0;
            }
        }
        return 1;
    }

}
