package session_20_recap.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5v2 {

    public static void main(String[] args) {
        String sentence = "This is a test sentence";

        String[] list = sentence.split(" ");
        List<String> words = Arrays.asList(list);
        Collections.reverse(words);

        String reversed = String.join(" ", words);

        System.out.println(reversed);
    }
}
