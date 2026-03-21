import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        // 1. Declaration
        Vector<String> v = new Vector<>();

        // 2. Add Elements
        v.add("Java");
        v.add("Python");
        v.add("C++");

        // Old method (legacy)
        v.addElement("HTML");

        System.out.println("Initial Vector: " + v);

        // 3. Add at specific index
        v.add(1, "JavaScript");
        System.out.println("After adding at index 1: " + v);

        // 4. Access Elements
        System.out.println("Element at index 2: " + v.get(2));
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // 5. Update Element
        v.set(2, "Updated");
        System.out.println("After update: " + v);

        // 6. Remove Elements
        v.remove("Python");  // remove by value
        v.remove(0);         // remove by index

        // Old method
        v.removeElement("HTML");

        System.out.println("After removal: " + v);

        // 7. Size & Check
        System.out.println("Size: " + v.size());
        System.out.println("Contains Java? " + v.contains("Java"));
        System.out.println("Is Empty? " + v.isEmpty());

        // 8. Traversal

        System.out.println("\nUsing for-each:");
        for(String s : v){
            System.out.println(s);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 9. Sorting
        Collections.sort(v);
        System.out.println("\nSorted Vector: " + v);

        // 10. Reverse
        Collections.reverse(v);
        System.out.println("Reversed Vector: " + v);

        // 11. Capacity (Vector specific)
        System.out.println("Capacity: " + v.capacity());

        // Increase capacity manually
        v.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity: " + v.capacity());

        // 12. Clear
        v.clear();
        System.out.println("After clear: " + v);

        /*
        ================== IMPORTANT NOTES ==================

        1. Vector is synchronized (thread-safe)
        2. Slower than ArrayList due to synchronization
        3. Mostly used in legacy systems (old code)
        4. Implements List interface
        5. Supports dynamic resizing (like ArrayList)
        6. Capacity concept exists (default grows automatically)

        INTERVIEW POINTS:
        - Vector vs ArrayList → Vector is thread-safe but slow
        - Why not use Vector? → Performance overhead
        - Modern alternative → ArrayList + Collections.synchronizedList()

        USE CASE:
        - Multi-threaded environment (rare today)
        - Legacy Java projects

        ONE-LINE:
        Vector = Thread-safe ArrayList (but outdated)

        =====================================================
        */
    }
}