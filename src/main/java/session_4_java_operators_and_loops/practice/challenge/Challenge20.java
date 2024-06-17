package session_4_java_operators_and_loops.practice.challenge;

import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third integer (c): ");
        int c = scanner.nextInt();

        int largest = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);

        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + largest);

    }
}
