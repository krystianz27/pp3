public class C3 {
    int counter = 0;
    
    public void increase() {
        this.counter ++;
    }

    public void increase(int n) {
        if (n >= 0) {
            this.counter += n;
        }
    }

    public void decrease() {
        this.counter --;
    }

    public void decrease(int n) {
         if (n >= 0) {
            this.counter -= n;
        }
    }

    public void cancel() {
        this.counter = 0;
    }

    public int value() {
        return counter;
    }


    public static void main(String[] args) {
        C3 c = new C3();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.increase(-3);
        c.decrease(2);
        System.out.println(c.value());
        c.cancel();
        System.out.println(c.value());
    }
}
