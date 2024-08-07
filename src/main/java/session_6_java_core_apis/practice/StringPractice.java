package session_6_java_core_apis.practice;

public class StringPractice {

    public static void main(String[] args) {
        //stringConcat();
        //System.out.println(getStringLength("Alice"));
        //System.out.println(getChar("Frank", 1));
        //System.out.println(isTrue("Hello", "He"));
        //System.out.println(isTrue2("Hello", "lo"));
        //System.out.println("             Bogdan    ");
        //System.out.println(getTrimmedString("     Bogdan     "));

        String sentence = "I like to watch movies";
        sentence = sentence
                .trim()
                .replace("o", "a")
                .toUpperCase();

        System.out.println(sentence);
    }

    public static String getTrimmedString(String input) {
        return input.trim();
    }

    public static boolean isTrue2(String input, String endsWith) {
        return input.endsWith(endsWith);
    }

    public static boolean isTrue(String input, String startsWith) {
        return input.startsWith(startsWith);
    }

    public static char getChar(String input, int index) {
        return input.charAt(index);
    }

    public static int getStringLength(String input) {
        return input.length();
    }

    public static void  stringConcat() {
        String value1 = "Hello";
        String value2 = "World";

        System.out.println(value1 + " " + value2);
        System.out.println(value1.concat(value2));
    }
}