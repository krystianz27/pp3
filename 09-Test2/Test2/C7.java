public class C7 extends Vehicle {
    int speed;

    public C7(int seats, int speed) {
        super(seats);
        this.speed = speed;
    }
    
    public int[] spec() {
        int[] sp = new int[2];
        sp[0] = super.getSeats();
        sp[1] = speed;

        return sp;
    }
    
}
