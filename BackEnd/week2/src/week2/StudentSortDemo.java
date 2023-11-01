package week2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Kishore"));
        students.add(new Student(102, "Yogesh"));
        students.add(new Student(103, "Jhonny"));
        students.add(new Student(104, "Shriman"));
        students.add(new Student(105, "Guna"));

 

        System.out.println("Unsorted Student Data:");
        for (Student student : students) {
            System.out.println(student);
        }

 

        Collections.sort(students, new NameComparator());

 

        System.out.println("\nSorted Student Data by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}