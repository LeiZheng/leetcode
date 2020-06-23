package linkedList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    ReverseLinkedList inst = new ReverseLinkedList();
    @Test
    public void reverseList1() {
        ListNode oriListNode = LinkedListUtils.createListNode(1, 2, 3, 4, 5);

        assertThat(LinkedListUtils.toArray(inst.reverseList(oriListNode)), is(new int[]{5,4,3,2,1,}));
    }
}