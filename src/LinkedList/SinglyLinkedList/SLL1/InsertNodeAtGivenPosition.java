package LinkedList.SinglyLinkedList.SLL1;

public class InsertNodeAtGivenPosition {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    void display(){
        ListNode current = head;
        while (current.next != null){
            System.out.print(current.data);
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.println("Null");

    }

    void insertAtPosition(int value,int position){
        ListNode newNode = new ListNode(value);
        if (position == 1){
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position -1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public static void main(String[] args) {
        InsertNodeAtGivenPosition sll = new InsertNodeAtGivenPosition();

        sll.head = new ListNode(2);
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(17);
        ListNode fourth = new ListNode(19);

        sll.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        sll.insertAtPosition(3,2);
        sll.display();

        sll.insertAtPosition(13,5);
        sll.insertAtPosition(7,4);
        sll.display();
    }
}
