package class_assi_day3;

public class Car {
	private boolean engineOn;
    private int speed;
    private double fuelLevel = 5;

    public void startEngine() {
        if (fuelLevel > 0) engineOn = true;
    }

    public void accelerate(int increment) {
        if (engineOn && fuelLevel > 0) {
            speed += increment;
            fuelLevel -= 0.5;
        } else {
            System.out.println("Cannot accelerate");
        }
    }

    public void showStatus() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuelLevel);
    }


public static void main(String[] args) {
    Car car = new Car();
    car.accelerate(20);
    car.startEngine();
    car.accelerate(20);
    car.showStatus();
}
}
