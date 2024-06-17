package session_4_java_operators_and_loops.practice.challenge;

public class Challenge7 {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 10;
        int sideThree = 5;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles"
                : "Scalene";

        System.out.println("The triangle is " + triangleType);
    }
}
