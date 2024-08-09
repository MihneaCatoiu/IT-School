package session_20_recap.practice.test.IT;

import session_8_recap.practice.MethodReturnTypes;

public class PrimitiveTypesDemo {

    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 12.5;
        char myChar = 'c';
        boolean myBoolean = true;
        long myLong = 44234234234L;

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);

        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        methodReturnTypes.testMethod();
    }
}