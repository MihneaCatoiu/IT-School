package session_20_recap.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {

    public static void main(String[] args) {
        String sentence = "Java is fun";

        String[] words = sentence.split(" ");
        List<String> wordsList = Arrays.asList(words);
        Collections.reverse(wordsList);

        String reversed = String.join(" ", wordsList);

        System.out.println(reversed);
    }
}
