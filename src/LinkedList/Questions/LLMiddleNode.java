package LinkedList.Questions;

public class LLMiddleNode {
    private ListNode head;
    private ListNode tail;

    private int size;

    public LLMiddleNode(){
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

    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
