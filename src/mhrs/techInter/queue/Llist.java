package mhrs.techInter.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Llist {
    public static void main(String[] args){
        Queue q = new LinkedList();
        q.add("Soe");
        q.add("Admission");
        q.add("Test");

        System.out.println("--------");
        q.remove();
        q.remove();
        System.out.println("--------");
        Iterator itr =  q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
