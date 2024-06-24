package session_5_advanced_flow_control.practice.challenge;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.println("Enter a number. To stop, enter '-1' ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            sum += number;
            System.out.println("The sum is: " + sum);
        }
    }
}
