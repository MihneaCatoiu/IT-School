package session_6_java_core_apis.challenge;

public class Challenge5 {

    public static void main(String[] args) {
        String ex = "this is a test sentence";

        StringBuilder sb = new StringBuilder();

        String[] words = ex.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append((word.substring(1)))
                                .append(" ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}
