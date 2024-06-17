package session_4_java_operators_and_loops.practice.challenge;

public class Challenge8 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

    }
}
