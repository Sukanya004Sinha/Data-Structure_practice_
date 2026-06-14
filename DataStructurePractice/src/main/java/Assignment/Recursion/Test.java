package Assignment.Recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Find duplicates in a list--[1,2,3,4,5,5,3 ]using java 8
//
public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 3);
        List<Integer> duplicates = numbers.stream().filter(num ->
                Collections.frequency(numbers, num) > 1).distinct().collect(Collectors.toList());
        System.out.println(duplicates);

    }
}

//through sql {1, 2, 3, 4, 5, 5, 3} distinct number

//Select num COUNT (*) As count from numbers
//    Group By num Having count (*)>1;

