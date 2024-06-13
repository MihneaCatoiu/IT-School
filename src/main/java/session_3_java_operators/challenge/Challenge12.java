package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();
        int secondNumber = ++number;
        int thirdNumber = --number;


        System.out.println("Initial value is = " + number);
        System.out.println("++ value is = " + secondNumber );
        System.out.println("-- value is = " + thirdNumber );
        scanner.close();
    }
}
