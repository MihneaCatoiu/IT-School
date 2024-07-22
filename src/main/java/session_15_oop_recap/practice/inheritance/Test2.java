package session_15_oop_recap.practice.inheritance;

public class Test2 {

    public static void main(String[] args) {

        Animal dog = new Dog("Rex", 2, "dog", "labrador", Size.LARGE);
        Dog dog2 = (Dog) dog;
        dog2.fetch();
        dog2.bark();
    }
}
