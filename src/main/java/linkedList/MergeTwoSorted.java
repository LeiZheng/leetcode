package linkedList;

public class MergeTwoSorted {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header = new ListNode();
        ListNode currentNode = header;
        for(;l1 != null || l2 != null;) {
            ListNode newNode = new ListNode();

            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    newNode.val = l1.val;
                    l1 = l1.next;

                } else {
                    newNode.val = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                newNode.val = l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                newNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            currentNode.next = newNode;
            currentNode = currentNode.next;
        }
        return header.next;
    }
}
