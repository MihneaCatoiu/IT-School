package session_19.challenge;

public class Challenge8 {

    public static void main(String[] args) {

        String sentence = "Hello World";

        long vowel = sentence.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("Vowel count: " + vowel);
    }
}
