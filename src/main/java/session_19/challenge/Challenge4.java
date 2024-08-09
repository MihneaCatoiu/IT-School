package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge4 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four");

        String sum = strings.stream()
                .collect(Collectors.joining(", "));

        System.out.println(sum);

    }
}
