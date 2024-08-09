package session_20_recap.practice.test.IT;

import kata.session_1.Person;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        //setName("Argument")
        firstPerson.setName("Andrew");
        firstPerson.setAge(34);
        firstPerson.setAddress("New York");

        Person secondPerson = new Person();
        secondPerson.setName("John");
        secondPerson.setAge(21);
        secondPerson.setAddress("Cluj");

        //System.out.println(firstPerson.getName());
        //System.out.println(secondPerson.getName());

        firstPerson.displayInfo();
        secondPerson.displayInfo();
    }
}