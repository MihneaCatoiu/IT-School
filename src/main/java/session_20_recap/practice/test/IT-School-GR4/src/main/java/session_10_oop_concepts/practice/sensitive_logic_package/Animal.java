package session_20_recap.practice.test.IT;

public class Animal {

    String name;
    double weight;
    int age;


    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    String getName() {
        return "Rex";
    }

    public String bark() {
        String bark = "ham!";
        int dogAge = 10;

        return bark;
    }
}