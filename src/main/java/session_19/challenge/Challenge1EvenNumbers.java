package session_19.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge1EvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));
    }
}
