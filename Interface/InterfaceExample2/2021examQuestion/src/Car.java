public class Car extends Vehicle implements Drivable {

    @Override
    public void drive() {
        System.out.println("Car can drive");
    }

    @Override
    public void start() {
        System.out.println("Car movement has started");
    }

    @Override
    public void stop() {
        System.out.println("Car movement has stopped");
    }
}
