public class Airplane extends Vehicle implements Flayable{

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

    @Override
    public void start() {
        System.out.println("Airplane has started");
    }

    @Override
    public void stop() {
        System.out.println("Airplane has stopped");
    }
}
