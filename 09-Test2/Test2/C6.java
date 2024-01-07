import java.util.ArrayList;

public class C6 {
    ArrayList<Person> family = new ArrayList<Person>();

    public void m1(Person p) {
        family.add(p);
    }
    

    public int m2() {
        int adults = 0;
        for (Person person : family) {
            if (person.getAge() >= 18) {
                adults ++;
            }
        }

        return adults;
    }
}
