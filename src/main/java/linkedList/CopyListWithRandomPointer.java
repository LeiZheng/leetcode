package linkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Node dupHeader = new Node(-1);
        Node dupTail = dupHeader;
        Node curr = head;
        Map<Node, Node> oldToDupMap = new HashMap<>();
        for(;curr != null;curr = curr.next) {
            Node node = new Node( curr.val);
            node.random = curr.random;
            dupTail.next = node;
            dupTail = dupTail.next;
            oldToDupMap.put(curr, node);
        }
        //relink the random node
        for(curr = dupHeader.next;curr!=null; curr = curr.next) {
            curr.random = oldToDupMap.get(curr.random);
        }
        return dupHeader.next;
    }

    private class Node {
        public Node random;
        int val;
        Node next;

        public Node(int val) {
            this.random = random;
            this.val = val;
            this.next = next;
        }
    }
}
