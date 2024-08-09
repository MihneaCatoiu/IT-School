package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge10 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long totalCharacters = strings.stream()
                .flatMapToInt(String::chars)
                .filter(c -> !Character.isWhitespace(c))
                .count();

        System.out.println("Total characters: " + totalCharacters);
    }
}
