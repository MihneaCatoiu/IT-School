package session_20_recap.practice.test.IT;

public class Car {

    //HAS-A - Car - Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}