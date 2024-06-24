package session_5_advanced_flow_control.practice.challenge;

public class Challenge9 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " Even ");
            } else {
                System.out.println(number + " Odd ");

            }
        }
    }
}
