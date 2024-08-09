package session_6_java_core_apis.challenge;

public class Challenge6v2 {

    public static void main(String[] args) {

        String ex = "The car has run out of gas, so I put some more in the car tank.";
        String c = "car";
        String t = "truck";

        StringBuilder sb = new StringBuilder(ex);
        int index = sb.indexOf(c);
        while (index != -1) {
            sb.replace(index, index + c.length(), t);
            index = sb.indexOf(c, index + t.length());

        }
        System.out.println(sb);
    }
}
