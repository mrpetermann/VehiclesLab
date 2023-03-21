public class Car extends Vehicle implements IDrivable {
    private int fuelEfficiency;

    public Car(int w, int c, int mpg) {
        super(w, c);
        this.fuelEfficiency = mpg;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void drive() {
        System.out.println("Vroom vroom");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
