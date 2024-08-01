package Queue.Implementation;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULTSIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULTSIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()){
//            throw new QueueException("Queue is Full");
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException{
        if (isEmpty()){
            throw  new QueueException("Queue is Empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws QueueException{
        if (isEmpty()){
            throw  new QueueException("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i!=end);
        System.out.println("End");
    }

}
