package session_20_recap.practice.test.IT;

import java.util.List;

@FunctionalInterface
public interface NegativeFilter {

    List<Integer> filter (List<Integer> numbers);
}