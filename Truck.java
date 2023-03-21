public class Truck extends Vehicle implements IDrivable {
    private int towingCapacity;

    public Truck(int w, int c, int tc) {
        super(w, c);
        this.towingCapacity = tc;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Ugga dugga");
    }

    @Override
    public String toString() {
        return "Truck";
    }
}
