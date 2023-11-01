package kkk;

import java.util.Arrays;
import java.util.List;
 
public class assign3{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
        int sumEven = numbers.stream()
            .filter(num -> num % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
 
        int sumOdd = numbers.stream()
            .filter(num -> num % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();
 
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}