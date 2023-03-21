import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 20);
        Truck truck = new Truck(4, 6, 5000);
        Truck truck2 = new Truck(4, 6, 5000);
        Boat boat = new Boat(7);

        Garage garage = new Garage();
        garage.add(car);
        garage.add(truck);
        garage.add(truck2);
        garage.add(boat);

        ArrayList<IDrivable> drivables = new ArrayList<>();
        drivables.add(car);
        drivables.add(truck);
        drivables.add(truck2);

        for(IDrivable drivable : drivables)
            drivable.drive();
    }

    public static void printWheels(Vehicle vehicle) {
        System.out.println(vehicle.getWheels());
    }
}
