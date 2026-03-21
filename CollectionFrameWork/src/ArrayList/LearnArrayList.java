package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.Collections;
// import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // List<String> studentname = new ArrayList<>();
        // //ArrayList methods

        // //add method
        // studentname.add("hemant");
        // studentname.add("mohit");
        // studentname.add("mukesh");
        // System.out.println(studentname);
        
        // //add method with index
        // studentname.add(1, "suresh");
        // System.out.println(studentname);

        // //addAll method
        // List<String> studentname2 = new ArrayList<>();
        // studentname2.add("ramesh");
        // studentname2.add("rajesh");
        // studentname.addAll(studentname2);
        // System.out.println(studentname);

        // //get method
        // String name = studentname.get(2);
        // System.out.println(name);

        // //remove method
        // studentname.remove("mohit");
        // System.out.println(studentname);

        // //remove method with index
        // studentname.remove(1);
        // System.out.println(studentname);


        // //size method
        // int size = studentname.size();
        // System.out.println(size);


        // //contains method
        // boolean contains = studentname.contains("hemant");
        // System.out.println(contains);


        // //clear method
        // studentname.clear();
        // System.out.println(studentname);

        // //isEmpty method
        // boolean isEmpty = studentname.isEmpty();
        // System.out.println(isEmpty);

        // //indexOf method
        // int index = studentname.indexOf("ramesh");
        // System.out.println(index);

        // //lastIndexOf method
        // int lastIndex = studentname.lastIndexOf("ramesh");
        // System.out.println(lastIndex);

        // //toArray method
        // String[] studentArray = studentname.toArray(new String[0]);     
        // for (String student : studentArray) {
        //     System.out.println(student);
        // }

        
        // //subList method
        // List<String> subList = studentname.subList(0, 2);
        // System.out.println(subList);


        //Iterator method
        // List<String> studentname = new ArrayList<>();
        // studentname.add("hemant");  
        // studentname.add("mohit");
        // studentname.add("mukesh");

        // Iterator<String> iterator = studentname.iterator();
        // while (iterator.hasNext()) {
        //     String name = iterator.next();
        //     System.out.println(name);
        // }

                              // sort method
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
       // numbers.sort(null); // Sort in natural order true way
       Collections.sort(numbers); // Sort in natural order
       System.out.println(numbers);
       //note: The sort method in the List interface is a default method that sorts the elements of the list according to their natural ordering. When you call numbers.sort(null), it uses the natural ordering of the elements (in this case, integers) to sort the list. Alternatively, you can use Collections.sort(numbers) to achieve the same result, as it also sorts the list in natural order. Both methods will sort the numbers in ascending order.
        

    }
}
