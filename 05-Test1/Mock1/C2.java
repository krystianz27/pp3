public class C2 {
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

}
