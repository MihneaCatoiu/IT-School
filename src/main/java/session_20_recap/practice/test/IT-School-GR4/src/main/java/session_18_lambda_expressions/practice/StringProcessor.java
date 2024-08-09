package session_20_recap.practice.test.IT;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));
    }
}