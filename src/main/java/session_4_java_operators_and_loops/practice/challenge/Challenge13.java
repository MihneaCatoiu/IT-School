package session_4_java_operators_and_loops.practice.challenge;

public class Challenge13 {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        boolean notIsRaining = !isRaining;
        boolean notIsSunny = !isSunny;

        System.out.println("Original values:");
        System.out.println("isRaining: " + isRaining);
        System.out.println("isSunny: " + isSunny);

        System.out.println("Negated values:");
        System.out.println("notIsRaining: " + notIsRaining);
        System.out.println("notIsSunny: " + notIsSunny);
    }
}
