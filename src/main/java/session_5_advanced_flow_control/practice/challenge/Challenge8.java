package session_5_advanced_flow_control.practice.challenge;

public class Challenge8 {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;

        System.out.println("The first " + n + " numbers of the Fibonacci series are:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
