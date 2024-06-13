package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {

        Scanner scannerFirstNumber = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle :");
        int a = scannerFirstNumber.nextInt();

        Scanner scannerSecondNumber = new Scanner(System.in);
        System.out.println("Please enter the breadth of the rectangle :");
        int b = scannerSecondNumber.nextInt();

        System.out.println("The area of the rectangle is = " + a * b);

    }

}
