package LinkedList.DoublyLinkedList;

public class DLLImplementation {

    private Node head;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;

        if (head != null){
            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }

        node.prev = last;
        last.next = node;
    }

//    public void insert(int value, int index){
//        if (index == 0){
//            insertFirst(value);
//            return;
//        }
//
//        if (index == size){
//            insertLast(value);
//            return;
//        }
//
//        Node temp = head;
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        Node node = new Node(value);
//        temp.next = node;
//
//        size++;
//    }

    public void insertAfter(int after,int value){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node = head;

        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + " <--> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayReverse(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.value + " <--> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        while (last != null){
            System.out.print(last.value + " <--> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
