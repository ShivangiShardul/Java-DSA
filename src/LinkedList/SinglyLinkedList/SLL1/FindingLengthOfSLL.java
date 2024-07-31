package LinkedList.SinglyLinkedList.SLL1;

public class FindingLengthOfSLL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode first = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode second = new SinglyLinkedList.ListNode(3);
        SinglyLinkedList.ListNode third = new SinglyLinkedList.ListNode(4);
        SinglyLinkedList.ListNode fourth = new SinglyLinkedList.ListNode(5);

        sll.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
        int length = FindingLengthOfSLL.countLength();
        System.out.println("\nLength of Linked List is " + length);
    }

    public static int countLength(){
        if (SinglyLinkedList.head == null){
            return 0;
        }

        int count = 0;
        SinglyLinkedList.ListNode current = SinglyLinkedList.head;

        while (current != null){
            count++;
            current = current.next;
        }
        return count;
//        System.out.println("Length of Linked List is " + count);
    }
}
