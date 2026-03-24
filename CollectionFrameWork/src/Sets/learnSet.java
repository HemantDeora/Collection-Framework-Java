package Sets;

import java.util.Set;

public class learnSet {
    public static void main(String[] args) {
        Set<String> set = Set.of("Java", "Python", "C++", "Go", "JavaScript");
        System.out.println("Set: " + set);
        System.out.println("Contains 'Python': " + set.contains("Python"));
        System.out.println("Size: " + set.size());

        // 🔹 Traversal
        System.out.println("Iterating:");
        for (String element : set) {
            System.out.println(element);
        }

        // 🔹 toArray(
        String[] array = set.toArray(new String[0]);
        System.out.println("Array: " + java.util.Arrays.toString(array));       

        // 🔹 equals() & hashCode()
        Set<String> anotherSet = Set.of("Java", "Python", "C++", "Go", "JavaScript");
        System.out.println("Equals: " + set.equals(anotherSet));
        System.out.println("HashCode: " + set.hashCode());

        // 🔹 isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());
    }
}
