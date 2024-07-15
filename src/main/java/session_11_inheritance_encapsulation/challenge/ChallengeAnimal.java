package session_11_inheritance_encapsulation.challenge;

public class ChallengeAnimal {

        void sound() {
            System.out.println("Animal makes sounds");
        }
    }

    class Dog extends ChallengeAnimal {
        void sound() {
            System.out.println("Bark");
        }
    }

    class Cat extends ChallengeAnimal {
        void sound() {
            System.out.println("Meow");
        }
    }

    class Wolf extends ChallengeAnimal{
        void sound() {
            System.out.println("Howl");
        }
    }

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog: ");
        dog.sound();

        Cat cat = new Cat();
        System.out.println("Cat: ");
        cat.sound();

        Wolf wolf = new Wolf();
        System.out.println("Wolf: ");
        wolf.sound();
    }
}