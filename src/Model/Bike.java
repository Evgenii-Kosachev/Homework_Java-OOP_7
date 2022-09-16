package Model;

public class Bike extends Vehicles{
    protected String frame;
    protected int transmission;
    protected String brakeSystem;
    protected String suspension;

    public Bike(String model, String registrationNumber, String engineCylinders,
                int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight,
                String frame, int transmission, String brakeSystem, String suspension) {

        super(model, registrationNumber, engineCylinders, gasTank, fuel, loadCapacity, maxSpeed, weight);
        this.frame = frame;
        this.transmission = transmission;
        this.brakeSystem = brakeSystem;
        this.suspension = suspension;
    }
}
