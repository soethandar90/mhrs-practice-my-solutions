package mhrs.round3;

import java.util.ArrayList;
import java.util.List;

public class IsTrivalentClass {
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{ 2147483647, -1, -1, -2147483648}));
    }

    static int isTrivalent(int[] a) {
        if(a.length<3){
            return 0;
        }
        List<Integer> list = new ArrayList<>();

        for(int i:a){
            if(!list.contains(i)){
                list.add(i);
            }
            if(list.size()>3){
                return 0;
            }
        }
        if(list.size()<3){
            return 0;
        }
        return 1;
    }
}
