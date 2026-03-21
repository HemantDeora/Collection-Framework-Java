package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
     // 1. Declaration (Best Practice)
        Map<Integer, String> map = new HashMap<>();

        // 2. put() → Add elements
        map.put(1, "Hemant");
        map.put(2, "Mohit");
        map.put(3, "Mukesh");
        map.put(1, "Updated"); // overwrite

        System.out.println("Initial Map: " + map);

        // 3. get() → Get value
        System.out.println("Value for key 2: " + map.get(2));

        // 4. containsKey() & containsValue()
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Mohit'? " + map.containsValue("Mohit"));

        // 5. remove()
        map.remove(3);
        System.out.println("After remove key 3: " + map);

        // 6. size() & isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty? " + map.isEmpty());

        // 7. putIfAbsent()
        map.putIfAbsent(2, "NewValue"); // will NOT replace
        map.putIfAbsent(4, "NewUser");  // will add
        System.out.println("After putIfAbsent: " + map);

        // 8. replace()
        map.replace(2, "Replaced");
        System.out.println("After replace: " + map);

        // 9. getOrDefault()
        System.out.println("Get key 10: " + map.getOrDefault(10, "Not Found"));

        // 10. keySet()
        System.out.println("\nKeys:");
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        // 11. values()
        System.out.println("\nValues:");
        for(String value : map.values()){
            System.out.println(value);
        }

        // 12. entrySet() (BEST METHOD 🔥)
        System.out.println("\nKey-Value Pairs:");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 13. forEach() (Modern way)
        System.out.println("\nUsing forEach:");
        map.forEach((k, v) -> System.out.println(k + " = " + v));

        // 14. clear()
        // map.clear();
        // System.out.println("After clear: " + map);

       for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.setValue(entry.getValue().toUpperCase()));
        }

        /*
        ================== IMPORTANT NOTES ==================

        1. HashMap stores data in key-value pairs
        2. Keys must be unique
        3. Values can be duplicate
        4. Order is NOT maintained
        5. Allows one null key & multiple null values
        6. Not thread-safe

        INTERNAL WORKING:
        - Uses hashing (hashCode + bucket)
        - Average time complexity O(1)
        - Collision handled using LinkedList / Tree (Java 8+)

        INTERVIEW POINTS:
        - Most used collection in real projects
        - Fast lookup & insertion
        - entrySet() is best for traversal
        - put() replaces value if key exists

        DIFFERENCE:
        HashMap vs HashSet:
        - HashMap → key-value
        - HashSet → only unique values

        HashMap vs TreeMap:
        - HashMap → no order
        - TreeMap → sorted order

        REAL USE:
        - API responses
        - JSON data
        - Caching
        - Database mapping

        ONE-LINE:
        HashMap = Fast key-value storage using hashing

        =====================================================
        */
    }
    
}
