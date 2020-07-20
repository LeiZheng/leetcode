package linkedList;

import tree.TreeNode;

import java.util.Stack;

public class FlattenMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        Node newHead = head;
        flatternRecur(head);
        return newHead;
    }

    private void flatternRecur(Node head) {
        if(head == null) return;
        Node nextNode = head.next;
        if(head.child != null) {
            flatternRecur(head.child);
            head.next = head.child;
            head.child.prev = head;
            Node curr = head.child;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = nextNode;
            if(nextNode != null) {
                nextNode.prev = curr;
            }
        }
        flatternRecur(nextNode);
    }

    public Node flatten2(Node head) {
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while(!stack.isEmpty() || curr != null) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.child;
            }
            curr = stack.pop();
            Node nextNode = curr.next;
            if(curr.child != null) {
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
            }
            else if(nextNode == null) {
                if(!stack.isEmpty()) {
                    curr.next = stack.lastElement().next;
                    if(curr.next != null)
                    curr.next.prev = curr;
                }
            }
            curr = nextNode;
        }
        return head;
    }

    public Node flatten3(Node head) {
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while(curr != null) {
            if(curr.child != null) {
                if(curr.next!=null) {
                    stack.push(curr.next);
                }
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
            if(curr.next == null && !stack.isEmpty()) {
                curr.next =  stack.pop();
                curr.next.prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}