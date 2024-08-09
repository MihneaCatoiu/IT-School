package session_20_recap.practice.test.IT;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}