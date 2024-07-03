package session_9_arrays.challenge;

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 12, 23, 93, 14, 54, 64, 71, 88, 90, 10 };
        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
