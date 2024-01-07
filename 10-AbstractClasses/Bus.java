public class Bus extends Vehicle {
    private int seatingCapacity;
    private boolean isDoubleDecker;

    public Bus(String make, String model, int year, int seatingCapacity, boolean isDoubleDecker) {
        super(make, model, year);
        this.seatingCapacity = seatingCapacity;
        this.isDoubleDecker = isDoubleDecker;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public boolean isDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean isDoubleDecker) {
        this.isDoubleDecker = isDoubleDecker;
    }

    @Override
    public String vehicleDetails() {
        return "Bus - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Seating Capacity: " + getSeatingCapacity() + ", Double Decker: " + isDoubleDecker();
    }
}
