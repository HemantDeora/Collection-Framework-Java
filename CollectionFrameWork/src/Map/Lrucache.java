package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    // Constructor
    public LRUCache(int capacity) {
        // accessOrder = true → maintains LRU order
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // Get value by key
    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    // Insert or update value
    public void put(int key, int value) {
        super.put(key, value);
    }

    // Remove least recently used entry
    @Override
    protected boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}

public class Lrucache  {   
    public static void main(String[] args) {
        // LRU Cache (Least Recently Used) is a cache eviction policy that removes the least recently accessed items when the cache reaches its capacity. It is commonly implemented using a combination of a HashMap and a Doubly Linked List to achieve O(1) time complexity for both get and put operations.


        LRUCache cache = new LRUCache(3);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        cache.get(1); // mark as recently used

        cache.put(4, 40); // removes least recently used (key 2)

        System.out.println("Final Cache: " + cache);


    }
}
