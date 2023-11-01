package week2;


import java.util.Iterator;
import java.util.TreeSet;

 

public class TreeSetProduct {
    public static void main(String[] args) {
        TreeSet<String> productSet = new TreeSet<>();

        productSet.add("Phone");
        productSet.add("Laptop");
        productSet.add("Headset");
        productSet.add("Charger"); 

        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("First product: " + productSet.first());
        System.out.println("Last product: " + productSet.last());
        System.out.println("Size of TreeSet: " + productSet.size());
        productSet.remove("Product B");
        System.out.println("Size of TreeSet after removal: " + productSet.size());
    }
}