package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Challenge2v2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your example: ");
            String example = scanner.nextLine();


            StringBuilder sb = new StringBuilder(example).reverse();

            if (example.equals(sb.toString())) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
