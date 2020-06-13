package amazon.linkedList;

public class ReverseNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHeader = new ListNode();
        ListNode newTail = newHeader;
        ListNode srcCurrent = head;
        ListNode startNodeForReverse = null;

        if(k == 1) return head;
        for(int i = 0;srcCurrent != null;i ++, srcCurrent = srcCurrent.next) {

            if(i % k == 0) {
                startNodeForReverse = srcCurrent;
            }
            else if((i + 1) % k == 0) {
                ListNode header = reverseNode(startNodeForReverse, k);
                newTail.next = header;
                newTail = startNodeForReverse;
                srcCurrent = startNodeForReverse;
            }
        }
        return newHeader.next;
    }

    private ListNode reverseNode(ListNode header, int k) {
        ListNode newHeader = new ListNode();
        ListNode newTail = newHeader;
        ListNode curr = header;

        for(int i = 0; i < k; i ++) {
            ListNode nextNode;
            nextNode = curr.next;
            curr.next = newHeader.next;
            newHeader.next = curr;
            if(i == 0) {
                newTail = curr;
            }

            curr = nextNode;
        }
        newTail.next = curr;

        return newHeader.next;
    }
}
