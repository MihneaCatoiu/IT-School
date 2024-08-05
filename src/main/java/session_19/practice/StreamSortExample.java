package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Alice");

        //sort names in natural order and print them
        names.stream()
                .sorted()
                .forEach(System.out::println);
        //.forEach(name -> System.out.println(name));
    }
}
