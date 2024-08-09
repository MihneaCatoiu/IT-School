package session_19.challenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class Challenge11 {

    public static void main(String[] args) {

        String filePath = "E:/it practice/IronMan.txt";

        try {
            String longestWord = Files.lines(Paths.get(filePath))
                    .flatMap(line -> Arrays.stream(line.split("\\W+")))
                    .max(Comparator.comparingInt(String::length))
                    .orElse("No words found");

            System.out.println("Longest word: " + longestWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
