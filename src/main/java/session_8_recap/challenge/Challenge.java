package session_8_recap.challenge;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Please enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Please enter the operation (+, -, *, /.): ");
        System.out.println("1. '+' ");
        System.out.println("2. '-' ");
        System.out.println("3. '*' ");
        System.out.println("4. '/' ");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1 :
                result = num1 + num2;
                System.out.println("Result :" + num1 + " + " + num2 + " = " + result );
                break;

            case 2 :
                result = num1 - num2;
                System.out.println("Result :" + num1 + " - " + num2 + " = " + result );
                break;

            case 3 :
                result = num1 * num2;
                System.out.println("Result :" + num1 + " * " + num2 + " = " + result );
                break;

            case 4 :
                result = num1 / num2;
                System.out.println("Result :" + num1 + " / " + num2 + " = " + result );
                break;

            default:
                System.out.println("Invalid!");
        }
        System.out.println("Do you want to continue? (y or n)");
        String ch = scanner.next();

        if (!ch.equalsIgnoreCase("y")) {
            exit = true;
            scanner.close();
        }
    }
}

