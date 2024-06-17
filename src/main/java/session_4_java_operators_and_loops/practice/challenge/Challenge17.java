package session_4_java_operators_and_loops.practice.challenge;

public class Challenge17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        // Simulate authentication based on conditions
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (!hasUsername || !hasPassword) {
            System.out.println("Authentication failed");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}
