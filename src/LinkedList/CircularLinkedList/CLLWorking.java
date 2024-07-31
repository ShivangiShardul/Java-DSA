package LinkedList.CircularLinkedList;

public class CLLWorking {
    public static void main(String[] args) {
        CLLImplementation list = new CLLImplementation();

        list.insert(12);
        list.insert(34);
        list.insert(56);
        list.insert(78);
        list.display();

        list.delete(34);
        list.display();
    }
}
