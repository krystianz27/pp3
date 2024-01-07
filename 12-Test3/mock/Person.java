public class Person {
    private String firstName;
    private String surname;

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String f() {
        return (firstName.substring(0, 1) + surname.substring(0, 1)).toUpperCase();
    }

    public static void main(String[] args) {
        Person person = new Person("anna", "may");
        System.out.println(person.f());
    }
}
