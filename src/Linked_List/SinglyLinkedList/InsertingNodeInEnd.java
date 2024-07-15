package Linked_List.SinglyLinkedList;

public class InsertingNodeInEnd {
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

    public static void main(String[] args) {
        InsertingNodeInEnd sll = new InsertingNodeInEnd();

        sll.insertNodeInEnd(22);
        sll.display();

        sll.insertNodeInEnd(33);
        sll.insertNodeInEnd(44);
        sll.insertNodeInEnd(55);
        sll.insertNodeInEnd(66);

        sll.display();
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


    public void insertNodeInEnd(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }
}
