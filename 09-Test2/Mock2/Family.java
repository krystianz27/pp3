public class Family {
    private Person[] members;

    public Family(Person[] people) {
        members = people;
    }

    public int adults() {
        int adultCount = 0;
        for (Person person : members) {
            if (person.getAge() >= 18) {
                adultCount++;
            }
        }
        return adultCount;
    }
}