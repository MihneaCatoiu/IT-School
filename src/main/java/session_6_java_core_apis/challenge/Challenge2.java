package session_6_java_core_apis.challenge;

public class Challenge2 {

    public static void main(String[] args) {

        String example = "civic";

        StringBuilder sb = new StringBuilder(example).reverse();

        if (example.equals(sb.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
