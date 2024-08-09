package session_19.challenge;

import java.util.stream.IntStream;

public class Challenge3 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .filter(Challenge3::isPrime)
                .forEach(System.out::println);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}
