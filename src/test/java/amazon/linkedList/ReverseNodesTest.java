package amazon.linkedList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReverseNodesTest {
    ReverseNodes inst = new ReverseNodes();
    @Test
    public void reverseKGroup2() {
        ListNode node = inst.reverseKGroup(LinkedListUtils.createListNode(1, 2, 3), 2);

        assertThat(LinkedListUtils.toArray(node), is(new int[]{2,1,3}));
    }
    @Test
    public void reverseKGroup22() {
        ListNode node = inst.reverseKGroup(LinkedListUtils.createListNode(1, 2, 3,4,5), 2);

        assertThat(LinkedListUtils.toArray(node), is(new int[]{2,1,4,3,5}));
    }

    @Test
    public void reverseKGroup3() {
        ListNode node = inst.reverseKGroup(LinkedListUtils.createListNode(1, 2, 3,4,5), 3);

        assertThat(LinkedListUtils.toArray(node), is(new int[]{3,2,1,4,5}));
    }
    @Test
    public void reverseKGroup1() {
        ListNode node = inst.reverseKGroup(LinkedListUtils.createListNode(1, 2, 3,4,5), 1);

        assertThat(LinkedListUtils.toArray(node), is(new int[]{1,2,3,4,5}));
    }
}