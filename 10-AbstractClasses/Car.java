public class Car extends Vehicle {
    private int seatingCapacity;
    private boolean isConvertible;

    public Car(String make, String model, int year, int seatingCapacity, boolean isConvertible) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
        this.isConvertible = isConvertible;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    @Override
    public String vehicleDetails() {
        return "Car - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Seating Capacity: " + getSeatingCapacity() + ", Convertible: " + isConvertible();
    }
}
