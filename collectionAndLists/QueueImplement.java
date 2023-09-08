package collectionAndLists;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplement {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>() ;

        q.offer(1);
        q.offer(2);
        System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.peek());



        System.out.println(q);
    }
}
