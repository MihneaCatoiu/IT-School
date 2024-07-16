package kata.session_4;

import java.util.Scanner;

public class ReverseNumberWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 1000000000 && (number % 10 == 0)) {
            System.out.println("Please introduce a valid number (number between 0 and 1.000.000) and the last digit is not 0");
        }

        int reverseNo = 0;

        while (number != 0) {
            reverseNo = reverseNo * 10 + number % 10;
            number /= 10;
        }

        System.out.println("The reversed number: " + reverseNo);
    }
}
