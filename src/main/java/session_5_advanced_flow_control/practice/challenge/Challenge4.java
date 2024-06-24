package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        String revString = new StringBuilder(string).reverse().toString();
        System.out.println("Reverse string: " + revString);
    }
}
