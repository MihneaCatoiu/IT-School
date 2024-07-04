package session_7_utility_classes.challenge;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge2 {
    public static void displayDateComponents(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + String.format("%02d", month));
        System.out.println("Day: " + String.format("%02d", day));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();

        displayDateComponents(dateStr);

        scanner.close();
    }
}
