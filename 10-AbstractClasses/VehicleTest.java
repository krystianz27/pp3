public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020, 5, false);
        Vehicle bus = new Bus("Volvo", "B9R", 2018, 50, true);
        Vehicle truck = new Truck("Ford", "F-150", 2021, 1200, true);

        System.out.println(car.vehicleDetails());
        System.out.println(bus.vehicleDetails());
        System.out.println(truck.vehicleDetails());
    }
}
