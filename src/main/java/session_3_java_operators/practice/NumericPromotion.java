package session_3_java_operators.practice;

public class NumericPromotion {

    public static void main(String[] args) {
        short e = 10;
        int f = e + 5;

        long a = 1000000000000L;

        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;

        System.out.println("Max long value: " + maxLongValue);
        System.out.println("Min long value: " + minLongValue);
        System.out.println("Max integer value: " + maxIntValue);

        long testLongValue = 2135123453462345749L;
        //max int: 45435523523525
        //max long: 454355235235254362346253754

        int newIntValue = (int)testLongValue;

        System.out.println("Test long value: " + testLongValue);
        System.out.println("New int value: " + newIntValue);
    }
}
