package amazon.linkedList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddTwoNumbersTest {
    AddTwoNumbers inst = new AddTwoNumbers();
    @Test
    public void addTwoNumbers() {
        ListNode listHeadNode = inst.addTwoNumbers(LinkedListUtils.createListNode(2, 4, 3), LinkedListUtils.createListNode(5, 6, 4));
        ListNode node1 = listHeadNode;
        ListNode node2 = node1.next;
        ListNode node3 = node2.next;
        assertThat(node1.val, is(7));
        assertThat(node2.val, is(0));
        assertThat(node3.val, is(8));
    }

}