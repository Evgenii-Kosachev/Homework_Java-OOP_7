package Model;

public class Hydrocycle extends Vehicles{
    protected String boatHull;
    protected String waterCannon;
    protected int lifeJackets;

    public Hydrocycle(String model, String registrationNumber, String engineCylinders,
                      int gasTank, String fuel, int loadCapacity, int maxSpeed, int weight,
                      String boatHull, String waterCannon, int lifeJackets) {

        super(model, registrationNumber, engineCylinders, gasTank, fuel, loadCapacity, maxSpeed, weight);
        this.boatHull = boatHull;
        this.waterCannon = waterCannon;
        this.lifeJackets = lifeJackets;
    }
}
