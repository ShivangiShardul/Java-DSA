package Queue.Implementation;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULTSIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULTSIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()){
//            throw new QueueException("Queue is Full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws QueueException{
        if (isEmpty()){
            throw  new QueueException("Queue is Empty");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws QueueException{
        if (isEmpty()){
            throw  new QueueException("Queue is Empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }
}
