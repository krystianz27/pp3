public class SurfaceArea {

    public static double cuboidArea(double x, double y, double z) {
        return x * y * z;
    }

    public static double sphereArea(double r, double h) {
        double area = Math.PI * Math.pow(r, 2) * h;
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }

    public static double coneArea(double r, double h) {
        double area = Math.PI * Math.pow(r, 2) * h / 3;
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(SurfaceArea.cuboidArea(10, 5, 3));
        System.out.println(SurfaceArea.sphereArea(5, 8));
        System.out.println(SurfaceArea.coneArea(5, 8));
    }
}
