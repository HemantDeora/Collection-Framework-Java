package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import java.util.Iterator;



public class linkedHasMapDemo {
    public static void main(String[] args) {

        //NOTE: LinkedHashMap maintains the insertion order of elements, unlike HashMap which does not guarantee any order. It is useful when you want to preserve the order of entries as they were added to the map. It also allows null values and one null key, similar to HashMap but with the added benefit of predictable iteration order .

        // Creating LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(101, "Java");
        map.put(103, "Python");
        map.put(102, "C++");
        map.put(104, "JavaScript");

        // Display map (insertion order maintained)
        System.out.println("Initial Map: " + map);

        // Access element
        System.out.println("Value for key 102: " + map.get(102));

        // Check key/value
        System.out.println("Contains key 101? " + map.containsKey(101));
        System.out.println("Contains value 'Python'? " + map.containsValue("Python"));

        // Remove element
        map.remove(103);
        System.out.println("After removing key 103: " + map);

        // Iterating using for-each
        System.out.println("\nIterating using for-each:");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
