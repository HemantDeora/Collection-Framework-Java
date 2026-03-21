package Comparator;

import java.util.Arrays;

import java.util.List;

class student {

    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student [name=" + name + ", age=" + age + "]";
    }

}

public class CompWithClass {
    public static void main(String[] args) {

        List<student> students = Arrays.asList(
                new student("hema", 25),
                new student("mohit", 22),
                new student("mukesh", 28));

        // sorting by age
        // students.sort(Comparator.comparing(s -> s.age));
        // students.forEach(s -> System.out.println(s.name + " - " + s.age));

        // sorting by name
        // students.sort(Comparator.comparing(s -> s.name));
        // students.forEach(s -> System.out.println(s.name + " - " + s.age));
        
        // sorting by name in reverse order
        students.sort((s1, s2) -> s2.name.compareTo(s1.name));
        students.forEach(s -> System.out.println(s.name + " - " + s.age));

    }
}
