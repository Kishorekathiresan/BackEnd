
package week2;

import java.util.HashMap;
import java.util.Set;

 

public class studentHash {
    private HashMap<Integer, String> empNames = new HashMap<>();

    public void setNames() {
        empNames.put(101, "Kishore");
        empNames.put(102, "Yogesh");
        empNames.put(103, "Jhonny");
        empNames.put(104, "Shriman");
        empNames.put(105, "Guna");
    }

    public void printNames() {
        empNames.forEach((key, value) -> System.out.println("Roll No: " + key + ", Name: " + value));
    }

    public void getName(int key) {
        String name = empNames.get(key);
        if (name != null) {
            System.out.println("Name for Roll No " + key + ": " + name);
        } else {
            System.out.println("Roll No " + key + " not found.");
        }
    }

    public void printNamesKeySet() {
        Set<Integer> keys = empNames.keySet();
        for (int key : keys) {
            System.out.println("Name: " + empNames.get(key));
        }
    }
    
    public void printSize() {
        System.out.println("Size of HashMap: " + empNames.size());
    }

    public void remove(int key) {
        empNames.remove(key);
    }
}


