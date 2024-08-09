package session_19.challenge;

public class Challenge5People {

    static class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String toString() {
            return firstName + " " + lastName + ", age: " + age;
        }
    }
}
