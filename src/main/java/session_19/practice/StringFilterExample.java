package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StringFilterExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        //filter names that starts with J
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));
    }
}
