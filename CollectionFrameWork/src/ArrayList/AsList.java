package ArrayList;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsList {

public static void main(String[] args) {
    
    // List<String> fruits = new ArrayList<>();
    // fruits.add("Apple");
    // fruits.add("Banana");
    // fruits.add("Cherry");

    // fruits.forEach(System.out::println);


                               // Using Arrays.asList to create a fixed-size list

    // List<String> list1 = Arrays.asList("mango","banana","cherry","date" );
    // list1.forEach(System.out::println);
    // list1.set(2, "grape");
    // System.out.println("After modification:");
    // list1.forEach(System.out::println);

                            // Using Arrays.asList with an array
    String[] array = {"mango", "banana", "cherry", "date"};
    List<String> list2 = Arrays.asList(array);
    list2.forEach(System.out::println); 

 

}
    
}
