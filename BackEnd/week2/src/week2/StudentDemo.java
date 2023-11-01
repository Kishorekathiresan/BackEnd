package week2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "John"));
        students.add(new Student(102, "Alice"));
        students.add(new Student(103, "Bob"));
        students.add(new Student(104, "Charlie"));
        students.add(new Student(105, "Eve"));

 

        System.out.println("Unsorted Student Data:");
        for (Student student : students) {
            System.out.println(student);
        }

 

        Collections.sort(students);

 

        System.out.println("\nSorted Student Data:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
