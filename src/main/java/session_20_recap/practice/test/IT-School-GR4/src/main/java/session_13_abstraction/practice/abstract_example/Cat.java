package session_20_recap.practice.test.IT;

import session_13_abstraction.practice.abstract_example.Animal;
import session_13_abstraction.practice.interface_example.Pet;

public class Cat extends Animal implements Pet {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("This cat is pooping");
    }
}