import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicleArrayList;

    public Garage() {
        vehicleArrayList = new ArrayList<>();
    }

    public Garage(ArrayList<Vehicle> list) {
        this.vehicleArrayList = list;
    }

    //add method - add vehicles to garage
    public void add(Vehicle v) {
        this.vehicleArrayList.add(v);
    }

    //toString method that returns a list of Vehicle
    @Override
    public String toString() {
        String builder = "";
        for(Vehicle v : this.vehicleArrayList) {
            builder += v + "\n";
        }

        return builder;
    }
}
