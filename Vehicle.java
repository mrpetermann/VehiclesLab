public abstract class Vehicle {
    private int wheels;
    private int capacity;

    public Vehicle(int w, int c) {
        this.wheels = w;
        this.capacity = c;
    }

    public void honk() {
        System.out.println("honk honk");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
