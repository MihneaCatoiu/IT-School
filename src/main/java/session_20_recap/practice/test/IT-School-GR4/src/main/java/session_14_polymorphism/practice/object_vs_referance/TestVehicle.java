package session_20_recap.practice.test.IT;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        //ctr+alt+b - go to the implementation of the method
        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //explicit casting
        Car anotherCar = (Car)car;
    }
}