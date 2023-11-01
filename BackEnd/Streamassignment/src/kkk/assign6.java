package kkk;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class assign6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "grape", "orange");
 
        // Ascending order
        List<String> ascendingSorted = strings.stream()
            .sorted()
            .collect(Collectors.toList());
 
        // Descending order
        List<String> descendingSorted = strings.stream()
            .sorted((s1, s2) -> s2.compareTo(s1))
            .collect(Collectors.toList());
 
        System.out.println("Ascending order: " + ascendingSorted);
        System.out.println("Descending order: " + descendingSorted);
    }
}