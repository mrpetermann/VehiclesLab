public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 20);
        Truck truck = new Truck(4, 6, 5000);

        printWheels(car);
        printWheels(truck);
    }

    public static void printWheels(Vehicle vehicle) {
        System.out.println(vehicle.getWheels());
    }
}
