package session_11_inheritance_encapsulation.practice;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

        void eat() {
            System.out.println("Dog is barking");
        }
}

class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}