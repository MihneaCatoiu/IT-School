package session_20_recap.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem4 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("tomato", "carrot", "cabbage", "tomato");

        HashMap<String, Integer> stringCounts = new HashMap<>();

        for (String str : strings) {
            stringCounts.put(str, stringCounts.getOrDefault(str, 0) + 1);
        }

        HashMap<String, Integer> duplicates = new HashMap<>();

        for (Map.Entry<String, Integer> entry : stringCounts.entrySet()){
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Duplicates adn their counts: " + duplicates);
    }
}
