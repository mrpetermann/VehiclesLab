public class Truck extends Vehicle{
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
}
