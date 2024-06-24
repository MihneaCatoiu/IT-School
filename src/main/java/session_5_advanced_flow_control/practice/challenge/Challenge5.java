package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive number. ");
            return;
        }

        int first = 0, second = 1;
        System.out.println("The first " + n + " numbers of the Fibonacci series are:");

        for (int i = 1; i <= n; i++) {
            System.out.println(n + " " );

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
