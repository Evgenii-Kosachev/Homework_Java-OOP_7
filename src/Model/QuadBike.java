package Model;

public class QuadBike extends Bike{
    public QuadBike(String model, String registrationNumber, String engineCylinders,
                    int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight,
                    String frame, int transmission, String brakeSystem, String suspension) {

        super(model, registrationNumber, engineCylinders, gasTank, fuel, loadCapacity,
                maxSpeed, weight, frame, transmission, brakeSystem, suspension);
    }
}
