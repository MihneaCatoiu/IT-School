package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Challenge7 {
    public static void main(String[] args) {
        System.out.println("The list is: ");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Pear");
        list.add("Banana");
        list.add("Grapes");
        list.add("Mango");

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthDifference = fruit1.length() - fruit2.length();
                if (lengthDifference != 0) {
                    return lengthDifference;
                }
                return fruit1.compareTo(fruit2);
            }
        };
        Collections.sort(list, customComparator);

        for (String o : list) {
            System.out.println(o);
        }
    }
}
