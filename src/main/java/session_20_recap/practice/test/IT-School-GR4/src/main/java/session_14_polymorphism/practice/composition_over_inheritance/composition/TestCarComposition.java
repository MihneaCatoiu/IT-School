package session_20_recap.practice.test.IT;

public class TestCarComposition {

    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car car = new Car(carEngine);
        car.start();
    }
}