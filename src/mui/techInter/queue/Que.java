package mui.techInter.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que{
    public static void main(String[] args){
        Queue pq = new PriorityQueue();
        pq.add("C");
        pq.add("E");
        pq.add("A");
        Iterator itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.print(pq.peek());
    }
}
