public class Converter {
    public static void main(String[] args) {
        int cmHeight = 170;
        double feet = 30.48d;
        int feetHeight = (int) (cmHeight / feet);
        int inches = (int) Math.round((cmHeight % feet / 2.54));

        System.out.println("I am " + cmHeight + " cm tall, i.e. " + feetHeight + " feet and " + inches + " inches.");

    }
}
