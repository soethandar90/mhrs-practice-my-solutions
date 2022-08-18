package mhrs.round1;

import java.util.Arrays;

public class areAnagramsBySortClass {
    public static void main(String[] args) {
        //char[] a1 = new char[]{'s', 'i', 't'};char[] a2 = new char[]{'i', 't', 's'};//1
        //char[] a1 = new char[]{'p', 'o', 'l','l'};char[] a2 = new char[]{'p', 'o', 'o','l'};//0
        //char[] a1 = new char[]{'s', 'i', 't'};char[] a2 = new char[]{'i', 'd', 's'};//0
        //char[] a1 = new char[]{'b', 'i', 'g'} ;char[] a2 = new char[]{'b', 'i', 't'};//0
        //char[] a1 = new char[]{'b', 'o', 'g'} ;char[] a2 = new char[]{'b', 'o', 'o'};//0
        //char[] a1 = new char[]{'b', 'i', 'g'};char[] a2 = new char[]{'b', 'i', 'g'};//1
        char[] a1 = new char[]{};char[] a2 = new char[]{};//1
        areAnagrams(a1, a2);
    }

    static int areAnagrams(char[] a1, char[] a2) {
        int rt = 0;
        int len = a1.length;
        if (a2.length == len) {
            if (len > 0) {
                char[] a11 = Arrays.copyOf(a1, len);
                char[] a22 = Arrays.copyOf(a2, len);
                Arrays.sort(a11);
                Arrays.sort(a22);
                if (Arrays.equals(a11, a22)) {
                    rt = 1;
                }
            } else {
                rt = 1;
            }
        }
        System.out.println(rt);
        return rt;
    }
}
