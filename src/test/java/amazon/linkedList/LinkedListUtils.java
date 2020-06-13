package amazon.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListUtils {
    static ListNode createListNode(int... nums) {
        List<ListNode> numListNodes = IntStream.of(nums).boxed().map(num -> new ListNode(num)).collect(Collectors.toList());
        for(int i = 0; i < numListNodes.size() - 1; i ++) {
            numListNodes.get(i).next = numListNodes.get(i + 1);
        }
        return numListNodes.get(0);
    }

    public static int[] toArray(ListNode node) {
        List<Integer> nums = new ArrayList<>();
        while(node != null) {
            nums.add(node.val);
            node = node.next;
        }
        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}
