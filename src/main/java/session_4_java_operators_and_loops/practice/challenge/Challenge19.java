package session_4_java_operators_and_loops.practice.challenge;

import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        Scanner scannerAge = new Scanner(System.in);
        System.out.println("Please enter your age :");
        int a = scannerAge.nextInt();

        if (a < 12) {
            System.out.println("Child");
            
        } else if (a >= 12 && (a <= 17)) {
            System.out.println("Teenager");
            
        } else if (a >= 18 && (a<=64)) {
            System.out.println("Adult");
            
        } else {
            System.out.println("senior");
        }
    }
}
