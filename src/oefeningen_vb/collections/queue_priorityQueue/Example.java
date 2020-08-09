package oefeningen_vb.collections.queue_priorityQueue;

import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {
        //queue of capacity of 11
        PriorityQueue<Double> queue = new PriorityQueue<>();

        //insert elements into queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.println("Polling from queue");

        //display elements in queue
        while (queue.size() > 0) {
            System.out.printf("\t%.1f", queue.peek()); //view top element
            queue.poll(); //remove top element
        }
    }
}
