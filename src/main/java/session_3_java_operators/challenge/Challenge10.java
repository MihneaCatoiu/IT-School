package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();
        int reversedSignNumber = -number;

        System.out.println("Your reversed number is : " + reversedSignNumber);
    }
}
