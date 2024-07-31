package LinkedList.DoublyLinkedList;

public class DLLWorking {
    public static void main(String[] args) {
        DLLImplementation list = new DLLImplementation();

        list.insertFirst(12);
        list.insertFirst(22);
        list.insertFirst(32);
//        list.displayReverse();
        list.display();

        list.insertLast(2);
//        list.displayReverse();
        list.display();

        list.insertAfter(22,20);
        list.display();
    }

}
