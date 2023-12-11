public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seat, int maxSpeed) {
        super(seat);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] specifications = { getSeats(), maxSpeed };
        return specifications;
    }

    // public static void main(String[] args) {
    // Car myCar = new Car(8, 200); // Initializing a car with 5 seats and max speed
    // of 200
    // int[] carSpecs = myCar.spec();
    // System.out.println("Number of seats: " + carSpecs[0]);
    // System.out.println("Max speed: " + carSpecs[1]);
    // }
}
