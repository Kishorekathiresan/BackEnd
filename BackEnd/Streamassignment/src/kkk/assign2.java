package kkk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class assign2 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Streams");

        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> lowercaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + stringList);
        System.out.println("Uppercase List: " + uppercaseList);
        System.out.println("Lowercase List: " + lowercaseList);
    }
}





