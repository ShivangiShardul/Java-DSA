package LinkedList.Questions;

//Leetcode
class LinkedListCycle {
    private ListNode head;
    private ListNode tail;

    private int size;

    public LinkedListCycle(){
        this.size = 0;
    }

    private class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        public ListNode() {

        }
    }

    public void insertFirst(int value){
        ListNode node= new ListNode(value);
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

        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp  = temp.next;
        }
        System.out.println("end");
    }

    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
