package Queue.Implementation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(56);
        queue.add(6);
        queue.add(23);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(49);
        deque.addLast(56);
        deque.removeFirst();
    }
}