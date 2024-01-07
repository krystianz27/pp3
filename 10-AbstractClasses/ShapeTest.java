public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        Shape triangle = new Triangle(4.0, 2.0, 3.0, 3.0);
        Shape circle = new Circle(3.0);

        System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
        System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
    }
}