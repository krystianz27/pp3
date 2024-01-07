public class Truck extends Vehicle {
    private int payloadCapacity;
    private boolean isFourWheelDrive;

    public Truck(String make, String model, int year, int payloadCapacity, boolean isFourWheelDrive) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }

    @Override
    public String vehicleDetails() {
        return "Truck - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear()
                + ", Payload Capacity: " + getPayloadCapacity() + ", Four-Wheel Drive: " + isFourWheelDrive();
    }
}
