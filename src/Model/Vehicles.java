package Model;

public abstract class Vehicles {
    protected String model;
    protected String registrationNumber;

    protected String engineCylinders;
    protected int gasTank;
    protected String fuel;

    protected int loadCapacity;
    protected int maxSpeed;
    protected int weight;

    public Vehicles(String model, String registrationNumber, String engineCylinders,
                    int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.engineCylinders = engineCylinders;
        this.gasTank = gasTank;
        this.fuel = fuel;
        this.loadCapacity = loadCapacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }
}
