package session_9_arrays.challenge;

public class Challenge1 {
    public static void main(String[] args) {
        String[] shoppingList = {"Apples", "Mango", "Pineapple"};
        System.out.println("Shopping list is: ");
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println((i + 1) + " . " + shoppingList[i]);
        }
    }
}
