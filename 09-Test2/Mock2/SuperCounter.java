public class SuperCounter extends Counter {
    public SuperCounter(int c) {
        super(c);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            add1(); // Utilizing the add1() method of the Counter class to increment by 1 'n' times
        }
    }
}