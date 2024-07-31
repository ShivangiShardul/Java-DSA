package Stack;

class CustomStack {
    protected int[] data;
    private static final int DEFAULTSIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULTSIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
//        return data[ptr--];
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peep from empty stack");
        }

        return data[ptr];
    }
}
