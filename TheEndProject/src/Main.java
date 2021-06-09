import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ContainerShip ContShip1st = ContainerShip.createShip();

        RefrigeratedContainer RefrCont = new RefrigeratedContainer(100, 100, 100,
                123, 2000, 4);
        LiquidContainer LiquidCont =  new LiquidContainer(1000, 100, 100,
                123, 2000, true);
        GasContainer GasCont = new GasContainer(1000, 100, 100, 123,
                2000, 120);

        ArrayList<Container> containers = new ArrayList<Container>();
        containers.add(LiquidCont);
        containers.add(GasCont);
        containers.add(RefrCont);

        System.out.println("\ndodanie kontenerow do statku nr1");
        ContShip1st.addContainer(RefrCont);
        ContShip1st.addContainer(containers);
        ContShip1st.addContainer(GasCont);
        System.out.println(ContShip1st.getContainers());

        System.out.println("\nprzeniesienie kontenerow ze statku nr2 na statek nr1");
        ContainerShip ContShip2nd = ContainerShip.createShip();
        ContShip1st.moveContainerFrom(ContShip2nd);
        System.out.println(ContShip1st.getContainers());
        System.out.println(ContShip2nd.getContainers());

        System.out.println("\nusuniecie kontenerow ze statku nr 2");
        ContShip2nd.removeContainer();
        System.out.println(ContShip2nd.getContainers());
    }
}



