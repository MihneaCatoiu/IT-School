package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {

        final int preNumber = 28;

        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

            if (guess <preNumber) {
                System.out.println("Too low");
            } else if (guess > preNumber) {
                System.out.println("Too high");

            }
        } while (guess != preNumber);
        System.out.println("Congrats!");
    }
}
