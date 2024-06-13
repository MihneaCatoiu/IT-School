package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The number is negative.");

        } else {
            System.out.println("The number is positive.");
        }


    }
}
