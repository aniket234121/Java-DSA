package dsa.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void QueueFunctions(Queue<String> queue){
        queue.add("hello");
        queue.add("World!");
        queue.add("this");
        queue.add("is Queue");
        System.out.println("size of queue is "+queue.size());
        System.out.println("queue is empty "+queue.isEmpty());
    }

    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
        QueueFunctions(queue);

    }
}
