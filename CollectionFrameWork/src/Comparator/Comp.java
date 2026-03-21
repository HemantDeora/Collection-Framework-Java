package Comparator;

import java.util.Arrays;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.Comparator;

// class StringLengthComparator implements Comparator<String> {
//     @Override
//     public int compare(String s1, String s2) {
//         return Integer.compare(s1.length(), s2.length());
//     }
// }

public class Comp {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "ban", "ko", "cherryyyyy");
        // fruits.sort(null); // Sort in natural order
        // System.out.println("Sorted fruits: " + fruits);

        // Using a custom Comparator to sort by length
        // Collections.sort(fruits, (a,b) -> a.length() - b.length());
        // System.out.println("Sorted fruits by length: " + fruits);

        // Using a custom Comparator to sort by length in reverse order
        // Collections.sort(fruits, (a,b) -> b.length() - a.length());
        // System.out.println("Sorted fruits by length in reverse order: " + fruits);

        // Using Comparator.comparing to sort by length
        // fruits.sort(Comparator.comparing(String::length));
        // System.out.println("Sorted fruits by length: " + fruits);

        // Using Comparator.comparing to sort by length in reverse order
        fruits.sort(
                Comparator.comparing(String::length).reversed());
        System.out.println("Sorted fruits by length in reverse order: " + fruits);

        // Comparator is a functional interface in Java that is used to define a custom
        // ordering for objects. It provides a way to compare two objects and determine
        // their relative order. The Comparator interface has a single method called
        // compare(), which takes two objects as parameters and returns an integer value
        // indicating their order.

        // The compare() method returns:
        // A negative integer if the first object is less than the second object.
        // Zero if the first object is equal to the second object.
        // A positive integer if the first object is greater than the second object.

        // Comparator can be used to sort collections of objects based on specific
        // criteria. For example, you can create a Comparator to sort a list of
        // employees by their salary or by their name.

        // Here's an example of how to use Comparator to sort a list of strings in
        // reverse order:

        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Collections.sort(names, new Comparator<String>() {
        // @Override
        // public int compare(String s1, String s2) {
        // return s2.compareTo(s1); // Sort in reverse order
        // }
        // });

        // Alternatively, you can use a lambda expression to simplify the code:

        // Collections.sort(names, (s1, s2) -> s2.compareTo(s1)); // Sort in reverse
        // order
    }
}
