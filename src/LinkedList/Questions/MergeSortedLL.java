package LinkedList.Questions;

import LinkedList.SinglyLinkedList.SLL2.SLLImplementation;

class MergeSortedLL {
    private Node head;
    private Node tail;

    private int size;

    public MergeSortedLL(){
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }

    public void insertFirst(int value){
        Node node= new Node(value);
        node.next= head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }
        System.out.println("end");
    }

    public static MergeSortedLL merge(MergeSortedLL first, MergeSortedLL second){
        Node f = first.head;
        Node s = second.head;

        MergeSortedLL ans = new MergeSortedLL();

        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    //Leetcode solution
    public Node merge1(Node first, Node second){
        Node dummyhead = new Node();
        Node tail = dummyhead;

        while (first != null && second != null){
            if (first.value < second.value){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            } else {
                tail.next = second;
                second = second.next;
                tail = tail.next;            }
        }

        tail.next = (first != null) ? first : second;
        return dummyhead.next;
    }


    public static void main(String[] args) {
        MergeSortedLL first = new MergeSortedLL();
        MergeSortedLL second = new MergeSortedLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.display();

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.display();

        MergeSortedLL ans = MergeSortedLL.merge(first,second);
        ans.display();

    }

}
