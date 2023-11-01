package kkk;

import java.util.Arrays;
import java.util.List;
 
public class assign5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "grape", "orange");
        String letterToCount = "a";
 
        long count = strings.stream()
            .filter(str -> str.startsWith(letterToCount))
            .count();
 
        System.out.println("Number of strings starting with '" + letterToCount + "': " + count);
    }
}