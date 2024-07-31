package LinkedList.SinglyLinkedList.SLL2;

public class SLLWorking {
    public static void main(String[] args) {
        SLLImplementation list = new SLLImplementation();

        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(12);
        list.insertFirst(15);
        list.display();

        list.insertLast(2);
        list.display();

        list.insert(10,2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

//        System.out.println(list.find(12));

        list.insertRec(88,2);
        list.display();
    }
}
