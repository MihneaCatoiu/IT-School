package session_20_recap.practice.test.IT;

public class Validator {

    public static boolean isValidUser(User user) {
        return user.getAge() > 18;
    }
}