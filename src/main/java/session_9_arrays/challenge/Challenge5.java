package session_9_arrays.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Bucharest");
        citiesList.add("Paris");
        citiesList.add("New York");
        citiesList.add("L.A.");
        citiesList.add("Rome");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a city: ");
        String cityNewName = scanner.nextLine();

        if (citiesList.contains(cityNewName)) {
            System.out.println("Already exists!");
        } else {
            citiesList.add(cityNewName);
            System.out.println("City added!");
        System.out.println("New list: ");
        for (String cityNew : citiesList) {
            System.out.println(citiesList);
        }
        }
        scanner.close();
    }
}