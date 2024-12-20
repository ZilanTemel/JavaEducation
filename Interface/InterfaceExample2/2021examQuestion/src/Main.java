public class Main {
    public static void main(String[] args) {
        // Car nesnesi oluştur
        Car car = new Car();
        System.out.println("Car actions:");
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        // Airplane nesnesi oluştur
        Airplane airplane = new Airplane();
        System.out.println("Airplane actions:");
        airplane.start();
        airplane.fly();
        airplane.stop();
    }
}
