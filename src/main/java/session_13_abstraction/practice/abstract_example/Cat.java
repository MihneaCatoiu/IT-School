package session_13_abstraction.practice.abstract_example;

import session_13_abstraction.practice.abstract_interface.Pet;

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