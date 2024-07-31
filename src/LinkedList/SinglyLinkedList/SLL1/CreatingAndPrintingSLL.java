package LinkedList.SinglyLinkedList.SLL1;

class CreatingAndPrintingSLL {
   ListNode head;

    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CreatingAndPrintingSLL sll = new CreatingAndPrintingSLL();

        sll.head = new ListNode(12);
        ListNode second = new ListNode(13);
        ListNode third = new ListNode(14);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(16);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

       sll.display();
    }

    void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data);
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
