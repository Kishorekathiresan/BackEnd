package kkk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class assign8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 6, 4);
 
        List<Integer> sortedNumbers = numbers.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());
 
        if (sortedNumbers.size() >= 2) {
            int secondSmallest = sortedNumbers.get(1);
            int secondLargest = sortedNumbers.get(sortedNumbers.size() - 2);
            System.out.println("Second smallest: " + secondSmallest);
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("Not enough unique elements to find second smallest and largest.");
        }
    }
}