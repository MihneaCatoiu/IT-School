package session_6_java_core_apis.challenge;

public class Challenge6 {

    public static void main(String[] args) {

        String ex = "The cat sat on the mat";
        String toReplace = "cat";
        String replacement = "dog";

        StringBuilder sb = new StringBuilder(ex);

        int index = sb.indexOf(toReplace);
        while (index != -1) {
            sb.replace(index, index + toReplace.length(), replacement);
            index = sb.indexOf(toReplace, index + replacement.length());
        }
        System.out.println("Original: " + ex);
        System.out.println("New: " + sb);
    }
}

