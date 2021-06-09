public class LiquidContainer extends Container implements Explosible{
    private boolean isExplosive;

    public LiquidContainer(double cargoWeight, double height, double length, int serialNo, double maxWeight,
                           boolean isExplosive) {
        super(cargoWeight, height, length, serialNo, maxWeight);
        this.isExplosive = isExplosive;
    }

    public boolean isExplosive() {
        return isExplosive;
    }

    @Override
    public void addCargoWeight(double cargoWeight) {
        if (isExplosive) {
            if (this.getMaxWeight() + cargoWeight < this.getMaxWeight() * 0.5) {
                this.setCargoWeight(cargoWeight + this.getCargoWeight());
            } else {
                System.out.println("Exception");
                this.explode();
            }
        } else {
            if (this.getMaxWeight() + cargoWeight < this.getMaxWeight() * 0.9) {
                this.setCargoWeight(cargoWeight + this.getCargoWeight());
            } else {
                System.out.println("Exception");
                this.explode();
            }
        }
    }


    @Override
    public void explode() {
        System.out.println("Liquid container with serial number: " + this.getSerialNo() + " exploded!");
    }
}
