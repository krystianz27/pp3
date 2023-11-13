public class C5 {
    int x, y;

    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return (y == 0) ? true : false;
    }

    public boolean isY() {
        return (x == 0) ? true : false;
    }

    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        C5 o = new C5(3, 0);
        System.out.println(o.isX());
        System.out.println(o.isY());
        System.out.println(o);
    }
}
