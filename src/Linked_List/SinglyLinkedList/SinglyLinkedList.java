package Linked_List.SinglyLinkedList;

class SinglyLinkedList {
    static ListNode head;        //Should be private

    static class ListNode{             //Should be private
        int data;              //Should be private
        ListNode next;           //Should be private

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        SinglyLinkedList.ListNode current = head;
        while (current != null){
            System.out.print(current.data);
            System.out.print(" --> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
