package session_20_recap.challenge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem7 {

    public static void main(String[] args) {

        List<Integer> primes = IntStream.iterate(101, n -> n + 1)
                .filter(Problem7::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(primes);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        else return true;
    }
}
