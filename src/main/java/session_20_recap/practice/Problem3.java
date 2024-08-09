package session_20_recap.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Problem3 {

    //Given a list of random numbers, use Java streams to find the smallest and largest
    // numbers in the list. Do not use the traditional loop-based method for this.

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(7);
        myList.add(3);

        Optional<Integer> min = myList.stream().min(Integer::compareTo);
        min.ifPresent(minValue -> System.out.println(minValue));

        Optional<Integer> max = myList.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}
