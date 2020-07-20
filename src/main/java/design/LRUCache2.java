package design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache2 {
    LinkedList<Integer> kepContainer = new LinkedList<>();
    Map<Integer, Integer> container = new HashMap<>();
    private final int capacity;
    public LRUCache2(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer val = container.get(key);
        if(val != null) {
            kepContainer.remove(Integer.valueOf(key));
            kepContainer.add(key);
            return val;
        }
        else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Integer val = get(key);
        if(val == -1 && kepContainer.size() == this.capacity) {
            container.remove(kepContainer.get(0));
            kepContainer.remove(0);
        }

        container.put(key, value);
        if(val == -1) {
            kepContainer.add(key);
        }
    }
}
