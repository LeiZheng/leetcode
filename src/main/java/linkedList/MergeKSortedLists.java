package linkedList;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode newHead = new ListNode();
        ListNode newTail = newHead;
        ListNode[] currs = Stream.of(lists).collect(Collectors.toList()).toArray(new ListNode[0]);

        for(;;) {
            //get the index of minimal value
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int i = 0; i < currs.length; i ++) {
                if(currs[i] != null && currs[i].val < min) {
                    minIndex = i;
                    min = currs[i].val;
                }
            }
            if(minIndex < 0) {
                break;
            }
            newTail.next = currs[minIndex];
            newTail = newTail.next;
            currs[minIndex] = currs[minIndex].next;

        }
        return newHead.next;
    }
}
