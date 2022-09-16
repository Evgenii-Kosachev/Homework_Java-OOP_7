package Model;

public class Car extends Bike{
    protected String body;
    protected int seatBelts;
    protected String airConditioner;

    public Car(String model, String registrationNumber, String engineCylinders,
               int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight,
               String frame, int transmission, String brakeSystem, String suspension,
               String body, int seatBelts, String airConditioner) {

        super(model, registrationNumber, engineCylinders, gasTank, fuel, loadCapacity,
                maxSpeed, weight, frame, transmission, brakeSystem, suspension);
        this.body = body;
        this.seatBelts = seatBelts;
        this.airConditioner = airConditioner;
    }
}
