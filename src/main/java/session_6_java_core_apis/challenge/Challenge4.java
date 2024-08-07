package session_6_java_core_apis.challenge;

public class Challenge4 {

    public static void main(String[] args) {
         String input = "This is a test phrase";

         StringBuilder sb = new StringBuilder();
         for (char c : input.toCharArray()) {
             if (!isVowel(c)){
                 sb.append(c);
             }
         }
        System.out.println(sb);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
