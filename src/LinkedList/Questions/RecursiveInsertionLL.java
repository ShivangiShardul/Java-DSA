package LinkedList.Questions;

import LinkedList.SinglyLinkedList.SLL2.SLLImplementation;

class RecursiveInsertionLL {
    private Node head;
    private int size;

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertRec(int value, int index){
        head = insertRec(value,index,head);
    }

    private Node insertRec(int value, int index, Node node){
        if (index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }
        System.out.println("end");
    }


    public static void main(String[] args) {
        RecursiveInsertionLL list = new RecursiveInsertionLL();
        list.insertRec(12,0);
        list.insertRec(13,1);
        list.insertRec(14,2);
        list.insertRec(11,1);
        list.display();
    }
}
