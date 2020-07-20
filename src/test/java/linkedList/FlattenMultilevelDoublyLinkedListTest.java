package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenMultilevelDoublyLinkedListTest {
    FlattenMultilevelDoublyLinkedList inst = new FlattenMultilevelDoublyLinkedList();
    @Test
    public void flatten() {
        Node node1 = new Node();
        node1.val = 1;
        Node node2 = new Node();
        node2.val = 2; node1.next = node2; node2.prev = node1;
        Node node3 = new Node();
        node3.val = 3;node1.child = node3;

//        Node node4 = new Node();
//        node1.val = 4;
//        Node node5 = new Node();
//        node1.val = 5;
//        Node node6 = new Node();
//        node1.val = 6;
//        Node node7 = new Node();
//        node1.val = 7;
//        Node node8 = new Node();
//        node1.val = 8;
//        Node node9 = new Node();
//        node1.val = 9;
//        Node node10 = new Node();
//        node1.val = 10;
//        Node node11 = new Node();
//        node1.val = 11;
//        Node node12 = new Node();
//        node1.val = 12;


        inst.flatten2(node1);
    }
}