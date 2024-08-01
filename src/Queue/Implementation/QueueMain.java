package Queue.Implementation;

public class QueueMain {
    public static void main(String[] args) throws QueueException{
//        CustomQueue queue = new CustomQueue(5);
//
//        queue.insert(12);
//        queue.insert(56);
//        queue.insert(6);
//        queue.insert(23);
//        queue.insert(44);
//        queue.display();
//        System.out.println(queue.front());
//        queue.remove();
//        queue.display();
//        System.out.println(queue.front());
//        queue.display();
//        queue.insert(5);

        CircularQueue queue = new CircularQueue(5);

        queue.insert(12);
        queue.insert(56);
        queue.insert(6);
        queue.insert(23);
        queue.insert(44);
        queue.display();
        queue.remove();
        queue.display();
        System.out.println(queue.front());
        queue.insert(345);
        queue.display();
    }
}
