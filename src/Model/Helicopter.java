package Model;

public class Helicopter extends Vehicles{
    protected String fuselage;
    protected int finalHeight;
    protected int diameterMainScrew;
    protected int tailRotorDiameter;

    public Helicopter(String model, String registrationNumber, String engineCylinders,
                      int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight,
                      String fuselage, int finalHeight, int diameterMainScrew, int tailRotorDiameter) {

        super(model, registrationNumber, engineCylinders, gasTank, fuel, loadCapacity, maxSpeed, weight);
        this.fuselage = fuselage;
        this.finalHeight = finalHeight;
        this.diameterMainScrew = diameterMainScrew;
        this.tailRotorDiameter = tailRotorDiameter;
    }
}
