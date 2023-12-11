// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1
        // Numbers n1 = new Numbers(1, 2, 4, 4, 5);
        // System.out.println(n1.different());
        // System.out.println(n1.numbersList);

        // 2
        // int[] array1 = { 12, 45, 67, 8, 99 };
        // int[] array2 = { 11, 23, 56, 78, 9 };
        // System.out.println(Arrays.arr(array1, array2));

        // 3
        // Person[] myFamily = {
        // new Person("Alice", 25),
        // new Person("Bob", 30),
        // new Person("Charlie", 17),
        // new Person("Diana", 22)
        // };

        // Family myFamilyObj = new Family(myFamily);
        // System.out.println("Number of adults in the family: " +
        // myFamilyObj.adults());

        // 4
        // Product productA = new Product("milk", 2);
        // Product productB = new Product("apple", 4);
        // ShoppingList myList = new ShoppingList();
        // myList.add(productA);
        // myList.add(productB);
        // System.out.println(myList.toString());
        // System.out.println(myList.total());

        // 5
        SuperCounter superCounter = new SuperCounter(5);
        System.out.println("Initial value: " + superCounter.getCounter());
        superCounter.addN(3);
        System.out.println("Value after adding 3: " + superCounter.getCounter());

        // 6
        // Car myCar = new Car(8, 200);
        // int[] carSpecs = myCar.spec();
        // System.out.println(Arrays.toString(carSpecs));
        // System.out.println("Number of seats: " + carSpecs[0]);
        // System.out.println("Max speed: " + carSpecs[1]);

        // 7
        // Cities cityList = new Cities(new String[] { "Warszawa", "Sopot", "Kielce",
        // "Szczecin", "Stargard" });
        // Cities filteredCities = cityList.filter('S');
        // System.out.println(filteredCities.cities());

    }
}