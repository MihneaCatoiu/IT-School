package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();

        int lowerBound = 1;
        int upperBound = 100;

        if (number >= lowerBound && number <= upperBound) {
            System.out.println("The number " + number + " is within the range [" + lowerBound + " - " + upperBound + "]");

        } else {
            System.out.println("The number " + number + " is NOT within the range [" + lowerBound + " - " + upperBound + "]");
        }
    }
}
