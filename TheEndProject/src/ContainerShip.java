import java.util.ArrayList;

public class ContainerShip {
    private ArrayList<Container> containers = new ArrayList<>();
    private double maxVelocity;
    private static int maxContainers;
    private static String mojaEska = "s22671";

    public static ContainerShip createShip() {
        return new ContainerShip();
    }

    static {
            maxContainers = Integer.parseInt(mojaEska.substring(1)) / 5;
        }


    public void addContainer(Container container) {
        if (this.getContainers().size() + 1 < maxContainers) {
            this.getContainers().add(container);
        } else {
            System.out.println("exception");
        }
    }

    public void addContainer(ArrayList<Container> containers) {
        if (this.getContainers().size() + containers.size() < maxContainers) {
            for (int i=0; i<containers.stream().count(); i++) {
                this.getContainers().add(containers.get(i));
            }
        } else {
            System.out.println("exception");
        }
    }

    public void moveContainerFrom(ContainerShip movingToShip, int containerNo) {
        movingToShip.addContainer(this.getContainers().get(containerNo));
    }

    public void moveContainerFrom(ContainerShip movingToShip) {
        movingToShip.addContainer(this.getContainers());
        this.removeContainer();
    }

    public void moveContainersIndex(int firstIndex, int secondIndex) {
        Container tmp = this.getContainers().get(secondIndex);

        this.getContainers().set(secondIndex, this.getContainers().get(firstIndex));
        this.getContainers().set(firstIndex, tmp);
    }

    public void removeContainer(int containerNo) {
        this.getContainers().remove(containerNo);
    }

    public void removeContainer(ArrayList<Integer> containersNoS) {
        for(int i=0; i<containersNoS.size(); i++) {
            this.getContainers().remove(i);
        }
    }

    public void removeContainer() {
        this.getContainers().clear();
    }

    public void setContainers(ArrayList<Container> containers) {
        this.containers = containers;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }


}
