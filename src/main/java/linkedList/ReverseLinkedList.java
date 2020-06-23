package linkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        ListNode temp;
        for(ListNode curr = head; curr != null;) {
            temp = curr.next;
            curr.next = newHead.next;
            newHead.next = curr;
            curr = temp;
        }
        return newHead.next;
    }
}
