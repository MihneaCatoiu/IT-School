package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge5 {

        public static void main(String[] args) {
            List<Challenge5People.Person> people = Arrays.asList(
                    new Challenge5People.Person("Alice", "Smith", 25),
                    new Challenge5People.Person("Dan", "Mora", 17),
                    new Challenge5People.Person("Anthony", "Stark", 21),
                    new Challenge5People.Person("Bob", "Rogers", 15),
                    new Challenge5People.Person("Bruce", "Wayne", 24)
            );

            List<Challenge5People.Person> adults = people.stream()
                    .filter(person -> person.age > 18)
                    .collect(Collectors.toUnmodifiableList());

            //System.out.println(adults);
            adults.forEach(System.out::println);
        }
}
