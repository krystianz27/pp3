public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        // dl.name = "Jack";
        // dl.surname = "Nowak";
        // dl.address ="Aleje Jerozolimskie 74/10";
        // dl.postalCode = "05-876";
        // dl.city = "Warsaw";
        // dl.licenseNumber = "758395745";
        // dl.yearOfIssue = 2015;
        // dl.category = "C+E";

        dl.setName("jAceK");
        dl.setSurname("Nowak");
        dl.setAddress("Aleje Jerozolimskie 74/10");
        dl.setPostalCode("05-876");
        dl.setCity("Warsaw");
        dl.setLicenseNumber("4827593753");
        dl.setYearOfIssue(2015);
        dl.setCategory("C+E");

        // dl.display(); 
        // System.out.println(dl.toString());
        System.out.println(dl);     
    }
}
 
