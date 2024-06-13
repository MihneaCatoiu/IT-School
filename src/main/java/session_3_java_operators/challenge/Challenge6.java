package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        Scanner scannerFirstNumber = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        int firstNumber = scannerFirstNumber.nextInt();

        Scanner scannerSecondNumber = new Scanner(System.in);
        System.out.println("Please enter the second number :");
        int secondNumber = scannerSecondNumber.nextInt();


        if (firstNumber < secondNumber) {
            System.out.println("The first number is lesser than the second.");
        } else if (firstNumber == secondNumber) {
            System.out.println("The first number is equal to the second number");

        } else if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second number");
        }

    }
}
