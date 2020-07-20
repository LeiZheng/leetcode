package design;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCache2Test {
    LRUCache2 inst = new LRUCache2(2);

    @Test
    public void testLRUCache2() {
//        ["LRUCache","put","put","put","put","get","get"]
//[[2],[2,1],[1,1],[2,3],[4,1],[1],[2]]
        inst.put(2,1);
        inst.put(1,1);
        inst.put(2,3);
        inst.put(4,1);
        inst.get(1);
        inst.get(2);
    }
}