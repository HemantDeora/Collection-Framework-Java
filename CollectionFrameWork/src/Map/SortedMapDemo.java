package Map;

// import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // Creating TreeMap (SortedMap)
        SortedMap<Integer, String> map = new TreeMap<>();

        // 🔹 put()
        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");
        map.put(5, "JavaScript");
        map.put(4, "Go");

        System.out.println("Initial Map: " + map);

        // 🔹 get()
        System.out.println("Get key 2: " + map.get(2));

        // 🔹 containsKey() & containsValue()
        System.out.println("Contains key 3: " + map.containsKey(3));
        System.out.println("Contains value 'Go': " + map.containsValue("Go"));

        // 🔹 size() & isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        // 🔹 firstKey() & lastKey()
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // 🔹 headMap(), tailMap(), subMap()
        System.out.println("HeadMap (<3): " + map.headMap(3));
        System.out.println("TailMap (>=3): " + map.tailMap(3));
        System.out.println("SubMap (2 to 5): " + map.subMap(2, 5));


        // 🔹 Entry methods
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        // 🔹 pollFirstEntry() & pollLastEntry()
        System.out.println("Poll First Entry: " + map.pollFirstEntry());
        System.out.println("Poll Last Entry: " + map.pollLastEntry());

        System.out.println("Map after polling: " + map);

        // 🔹 Traversal
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔹 keySet() & values()
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // 🔹 remove()
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 🔹 clear()
        map.clear();
        System.out.println("After clear(): " + map);
       
    }
}
