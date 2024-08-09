package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Challenge2 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        Optional<String> result = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        result.ifPresent(System.out::println);
    }
}
