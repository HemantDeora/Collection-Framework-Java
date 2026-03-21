import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class learnLinkedList {
    public static void main(String[] args) {
        // 1. Declaration
        LinkedList<String> list = new LinkedList<>();

        // 2. Add Elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");

        System.out.println("Initial List: " + list);

        // 3. Add First & Last
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After addFirst & addLast: " + list);

        // 4. Get Elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Update Element
        list.set(2, "Updated");
        System.out.println("After update: " + list);

        // 6. Remove Elements
        list.remove();           // remove first
        list.remove(2);          // remove by index
        list.removeFirst();
        list.removeLast();

        System.out.println("After removal: " + list);

        // 7. Check Methods
        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        // 8. Traversal

        System.out.println("\nUsing for-each:");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 9. Reverse Traversal
        System.out.println("\nReverse Traversal:");
        Iterator<String> rev = list.descendingIterator();
        while(rev.hasNext()){
            System.out.println(rev.next());
        }

        // 10. Queue Operations
        list.offer("NodeJS");
        list.offerFirst("React");
        list.offerLast("Angular");

        System.out.println("\nAfter Queue operations: " + list);

        System.out.println("Peek: " + list.peek());      // first element
        System.out.println("Poll: " + list.poll());      // remove first

        // 11. Stack Operations
        list.push("StackTop");
        System.out.println("\nAfter push: " + list);

        System.out.println("Pop: " + list.pop());

        // 12. Sorting
        Collections.sort(list);
        System.out.println("\nSorted List: " + list);

        // 13. Clear List
        list.clear();
        System.out.println("After clear: " + list);
    }
}
