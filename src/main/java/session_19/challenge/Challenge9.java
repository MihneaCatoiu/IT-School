package session_19.challenge;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Challenge9 {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        Map<String, Long> wordCount = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String mostFountWord = wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Most frequent word: " + mostFountWord);
        System.out.println("Frequency: " + wordCount.get(mostFountWord));
    }
}
