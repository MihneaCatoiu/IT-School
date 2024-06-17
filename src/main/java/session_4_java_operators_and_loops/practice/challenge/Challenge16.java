package session_4_java_operators_and_loops.practice.challenge;

public class Challenge16 {
    public static void main(String[] args) {
        int number = 50;

        number = -number;
        System.out.println("Negated number: " + number);

        number = Math.abs(number);
        System.out.println("Absolute value: " + number);

        number++;
        System.out.println("Incremented value: " + number);
    }
}
