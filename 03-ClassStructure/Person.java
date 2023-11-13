import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
    public String name;
    public int weight, height;
    public double bmi;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        double heightM = height / 100.0;
        double bmi = weight / heightM / heightM;
        BigDecimal bg = new BigDecimal(bmi).setScale(1, RoundingMode.HALF_UP);
        bmi = bg.doubleValue();
        this.bmi = bmi;
    }

    public void displayRecord() {
        calculateBMI();
        System.out.println(name);
        System.out.println(weight);
        System.out.println(height);
        if (bmi < 18.5) {
            System.out.println("BMI too low");

        } else if (bmi <= 24.9) {
            System.out.println(bmi);
        } else {
            System.out.println("BMI too high");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Name1", 80, 180);
        Person person2 = new Person("Name2", 30, 180);
        Person person3 = new Person("Name3", 130, 180);
        // person1.calculateBMI();
        // person2.calculateBMI();
        // person3.calculateBMI();
        person1.displayRecord();
        person2.displayRecord();
        person3.displayRecord();
    }
}
