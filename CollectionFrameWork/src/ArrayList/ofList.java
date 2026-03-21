package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ofList {
    public static void main(String[] args) {
        
    // List<String> list = List.of("mango", "banana", "cherry", "date");
    // list.forEach(System.out::println);


                         // Using List.of to create an immutable list
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    List<Integer> number2 = List.of(4,5,6,7,8);
    numbers.addAll(number2);
    numbers.forEach(System.out::println);


    // list.add("grape"); // This will throw UnsupportedOperationException
    // list.set(2, "grape"); // This will also throw UnsupportedOperationException

    //explaintion: The List.of() method creates an immutable list, which means that you cannot modify the list after it has been created. Any attempt to add, remove, or change elements in the list will result in an UnsupportedOperationException. This is because the list is designed to be unmodifiable, providing a fixed set of elements that cannot be altered.


    }
}
