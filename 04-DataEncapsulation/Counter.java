public class Counter {
    int counter = 0;

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int n) {
        this.counter += n;
    }

    public void decrease(int n) {
        this.counter -= n;
    }

    public int value() {
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}
