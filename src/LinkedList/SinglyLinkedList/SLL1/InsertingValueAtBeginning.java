package LinkedList.SinglyLinkedList.SLL1;

public class InsertingValueAtBeginning {
    // creating a node
    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    // displaying the linked list
    void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data);
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.print("Null\n");
    }

    public void insertNode(int value){
        //Inserting value at beginning
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
       InsertingValueAtBeginning sll = new InsertingValueAtBeginning();

//       InsertingValueAtBeginningSLL.head = new LinkNode(1);
//       LinkNode first = new LinkNode(12);
//       LinkNode second = new LinkNode(2);
//       LinkNode third = new LinkNode(13);
//
//       InsertingValueAtBeginningSLL.head.next = first;
//       first.next = second;
//       second.next = third;

//       sll.display();

       sll.insertNode(11);
       sll.insertNode(12);
       sll.insertNode(13);
       sll.insertNode(14);

       sll.display();
    }
}
