public class GasContainer extends Container implements Explosible{
    private double pressure;

    public GasContainer(double cargoWeight, double height, double length, int serialNo, double maxWeight,
                        double pressure) {
        super(cargoWeight, height, length, serialNo, maxWeight);
        this.pressure = pressure;
    }

    @Override
    public void removeCargo() {
        this.setCargoWeight(this.getCargoWeight() * 0.95);
    }

    @Override
    public void explode() {
        System.out.println("Gas container with serial number: " + this.getSerialNo() + " exploded!");
    }
}

