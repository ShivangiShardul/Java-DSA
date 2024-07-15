package Linked_List.SinglyLinkedList;

public class CreatingSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.head = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode first = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(8);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(5);

        linkedList.head.next = first;
        first.next = second;
        second.next = third;
//        third.next = null;

        SinglyLinkedList.ListNode current = linkedList.head;
        while (current != null){
            System.out.print(current.data);
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
