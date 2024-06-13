package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the original price : ");
        double originalPrice = scanner.nextDouble();

        System.out.println("Enter the discount : ");
        double discount = scanner.nextDouble();
        double priceAfterDiscount = originalPrice - ((originalPrice * discount) / 100);

        System.out.println("The price after the discount is = " + priceAfterDiscount);
    }
}
