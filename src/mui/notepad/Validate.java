package mui.notepad;

import javax.swing.*;
import java.util.ArrayList;

public class Validate {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2})); //1
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2})); //0
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4})); //0
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4})); //0
        System.out.println(isRailroadTie(new int[]{1, 2})); //1
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2})); //1
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3})); //1
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0})); //0
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10})); //0
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0})); //0
    }

    static int isRailroadTie(int[] a){
        if((a.length+1)%3!=0 || a[0]==0 || a[a.length-1]==0){
            return 0;
        }
        for(int i=0;i<a.length;i++){
            if(((i+1)%3==0 && a[i]!=0)||((i+1)%3!=0 && a[i]==0)){
                return 0;
            }
        }
        return 1;
    }
}


