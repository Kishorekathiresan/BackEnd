package week2;

public class TestHashMap {
    public static void main(String[] args) {
        studentHash student = new studentHash();
        student.setNames();
        System.out.println("All Student Names:");
        student.printNames();
        student.getName(102);
        System.out.println("All Student Names using KeySet:");
        student.printNamesKeySet();
        student.printSize();
        student.remove(103);
        System.out.println("Student with Roll No 103 removed.");
        student.printSize();
    }
}