package mhrs.entrance;

public class samepleCharacterArray {
    public static void main(String[] args) {
        //char[] a = new char[]{'a','b','c'};int start = 0;int len = 4;//null
        //char[] a = new char[]{'a', 'b', 'c', 'd'};int start = 1;int len = 3;//b c d
        //char[] a = new char[]{'a', 'b', 'c', 'd'};int start = 0;int len = 2;//a b
        //char[] a = new char[]{'a', 'b', 'c', 'd'};int start = 0;int len = 1;//a
        //char[] a = new char[]{'a', 'b', 'c'};int start = 1;int len = 3;//null
        //char[] a = new char[]{'a', 'b', 'c'};int start = 1;int len = 2;//b c
        //char[] a = new char[]{'a', 'b', 'c'};int start = 1;int len = 1;//b
        //char[] a = new char[]{'a', 'b', 'c'};int start = 2;int len = 2;//null
       // char[] a = new char[]{'a', 'b', 'c'};int start = 2;int len = 1;//c
     //   //char[] a = new char[]{'a', 'b', 'c'};int start = 3;int len = 1;//null
        //char[] a = new char[]{'a', 'b', 'c'};int start = 1;int len = 0;//{}
        //char[] a = new char[]{'a', 'b', 'c'};int start = -1;int len = 2;//null
        //char[] a = new char[]{'a', 'b', 'c'};int start = -1;int len = -2;//null
        char[] a = new char[]{};int start = 0;int len = 1;//null
        f(a, start, len);
    }

    static char[] f(char[] a, int start, int len) {
        if (start < 0 || len < 0 || start + len > a.length) {
            return null;
        } else {
            char[] result = new char[len];
            for (int i = start, j = 0; j < len; i++, j++) {
                result[j] = a[i];
            }
            for (char k : result) {
                System.out.println(k);
            }
            return result;
        }
    }
}
