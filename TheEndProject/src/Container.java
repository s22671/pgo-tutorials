import java.util.HashSet;
import java.util.Random;

public class Container {

    private double cargoWeight;
    private double height;
    private double length;
    private  int serialNo;
    private double maxWeight;

    Container(double cargoWeight, double height, double length, int serialNo, double maxWeight) {
        this.cargoWeight = cargoWeight;
        this.height = height;
        this.length = length;
        this.serialNo = serialNo;
        this.maxWeight = maxWeight;
    }


    public void addCargoWeight(double cargoWeight) {
        if (this.getCargoWeight() + cargoWeight < this.getMaxWeight()) {
            this.setCargoWeight(cargoWeight + this.getCargoWeight());
        } else {
            System.out.println("Exception");
        }
    }

    private void explode() {
    }

    public void removeCargo() {
        this.setCargoWeight(0);
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
}
