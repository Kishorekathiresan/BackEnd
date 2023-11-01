package kkk;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class assign7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 6, 4);
 
        Optional<Integer> max = numbers.stream()
            .max(Integer::compareTo);
 
        Optional<Integer> min = numbers.stream()
            .min(Integer::compareTo);
 
        System.out.println("Maximum value: " + max.orElse(0));
        System.out.println("Minimum value: " + min.orElse(0));
    }
}