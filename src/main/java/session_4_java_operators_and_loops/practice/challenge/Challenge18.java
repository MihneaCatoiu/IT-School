package session_4_java_operators_and_loops.practice.challenge;

public class Challenge18 {
    public static void main(String[] args) {
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Array before decrement:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }

        System.out.println("Array after decrement:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
