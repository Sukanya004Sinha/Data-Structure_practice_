package Assignment.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Find second largest number in an integer array using streams?
//        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Optional<Integer>secondLargest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondLargest);

    }
}
