public class RefrigeratedContainer extends Container implements  Explosible {
    private double temperature;
    private String products;
    private static String mojaEska = "s22671";


    public RefrigeratedContainer(double cargoWeight, double height, double length, int serialNo, double maxWeight,
                               double temperature) {
        super(cargoWeight, height, length, serialNo, maxWeight);
        this.temperature = temperature;
    }

    {
        int eska = Integer.parseInt(mojaEska.substring(1));
        String[] productsArray = {"banany", "czekolada", "ryba", "mieso", "lody czekoladowe", "mrozona pizza", "ser",
                "kielbaski", "maslo", "mleko",};

        for(int i=0; i<mojaEska.substring(1).length(); i++) {
            this.products = this.products + " " + productsArray[Integer.parseInt(mojaEska.substring(i+1, i+2))];
        }
    }


}
