package linkedList;

import static org.hamcrest.CoreMatchers.is;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumRootListNode = null;
        ListNode sumCurrentNode = null;
        boolean isCarryOver = false;
        for(;l1 != null || l2 != null;) {
            ListNode newSumNode = null;
            if(l1 != null && l2 != null) {
                newSumNode = new ListNode(l1.val + l2.val);
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 != null) {
                newSumNode = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if(l2 != null) {
                newSumNode = new ListNode(l2.val);
                l2 = l2.next;
            }
            newSumNode.val = newSumNode.val + (isCarryOver ? 1 : 0);
            isCarryOver = newSumNode.val >= 10;
            if(isCarryOver) {
                newSumNode.val = newSumNode.val - 10 ;
            }

            if(sumRootListNode == null) {
                sumCurrentNode = sumRootListNode = newSumNode;
            }
            else {
                sumCurrentNode.next = newSumNode;
                sumCurrentNode = newSumNode;
            }
        }
        if(isCarryOver) {
            sumCurrentNode.next = new ListNode(1);
        }
        return sumRootListNode;
    }

}
