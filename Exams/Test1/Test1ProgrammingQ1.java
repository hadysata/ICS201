class Vehicle {
    private double maxSpeed;
    private int wheels;

    public Vehicle() {
        this.maxSpeed = 100;
        this.wheels = 4;
    }

    public Vehicle(double maxSpeed, int wheels) {
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return String.format("Max speed: %.2f %nWheels: %s %n", maxSpeed, wheels);
    }
}

class Bicycle extends Vehicle {
    private int gears;

    public Bicycle() {
        super(60, 2);
    }

    public Bicycle(int gears) {
        super(60, 2);
        this.gears = gears;
    }

    public Bicycle(double maxSpeed, int gears) {
        super(maxSpeed, 2);
        this.gears = gears;
    }

    @Override
    public String toString() {
        return String.format("Max speed: %.2f %nWheels: %s %nGears: %s %n", getMaxSpeed(), getWheels(), this.gears);
    }

}

public class Test1ProgrammingQ1 {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Vehicle();
        vehicles[1] = new Vehicle(120, 4);
        vehicles[2] = new Bicycle(60, 3);
        vehicles[3] = new Bicycle();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
