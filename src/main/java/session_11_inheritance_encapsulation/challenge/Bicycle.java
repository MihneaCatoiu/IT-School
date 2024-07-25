package session_11_inheritance_encapsulation.challenge;

public class Bicycle {
    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Gear is: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed increased to: " + speed);
    }

    public void applyBrake(int decrement) {
        if (speed <= 0) speed = 0;
        System.out.println("The vehicle has stopped.");
    }
    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }
    public String toString() {
        return "Bicycle speed is " + speed + "and gear is " + gear + ".";
    }

}
