package linkedList;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeKSortedListsTest {
    MergeKSortedLists inst = new MergeKSortedLists();
    @Test
    public void mergeKLists() {
        ListNode newListNode = inst.mergeKLists(new ListNode[]{
                LinkedListUtils.createListNode(1, 4, 5),
                LinkedListUtils.createListNode(1, 3, 4),
                LinkedListUtils.createListNode(2, 6)
        });

        assertThat(LinkedListUtils.toArray(newListNode), is(new int[]{1,1,2,3,4,4,5,6}));
    }
}