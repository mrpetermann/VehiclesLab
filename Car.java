public class Car extends Vehicle{
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
}
