package design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {
    // use the double direction link to improve O(1) operations.
    List<Integer> values = new LinkedList<>();
    Map<Integer, Integer> keyValMap = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {

        this.capacity = capacity;
    }

    public int get(int key) {
        if(keyValMap.containsKey(key)) {
            values.remove(Integer.valueOf(key));
            values.add(key);
            return keyValMap.get(key);
        }
        else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(keyValMap.containsKey(key)) {
            values.remove(Integer.valueOf(key));
        }
        if(values.size() >= capacity) {
            keyValMap.remove(values.remove(0));
        }
        values.add(key);
        keyValMap.put(key, value);
    }
}
