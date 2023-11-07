import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DrivingLicense {
    // public String name;
    // public String surname;
    // public String address;
    // public String postalCode;
    // public String city;
    // public String licenseNumber;
    // public int yearOfIssue;
    // public String category;

    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String category;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        String name1 =name.toLowerCase();
        name1 = name1.substring(0, 1).toUpperCase() + name1.substring(1);
        this.name = name1;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        LocalDate myDate = LocalDate.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("YYYY");
        Integer year = Integer.valueOf(myDate.format(myFormatter));

        if (yearOfIssue >= 1980 && yearOfIssue <= year ) {
            this.yearOfIssue = yearOfIssue;            
        }
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Address: " + getAddress());
        System.out.println("Postal Code: " + getPostalCode());
        System.out.println("City: " + getCity());
        System.out.println("License Number: " + getLicenseNumber());
        System.out.println("Year of issue: " + getYearOfIssue());
        System.out.println("Category: " + getCity());

    }

    @Override
    public String toString() {
        return "DrivingLicense [name=" + name + ", surname=" + surname + ", address=" + address + ", postalCode="
                + postalCode + ", city=" + city + ", licenseNumber=" + licenseNumber + ", yearOfIssue=" + yearOfIssue
                + ", category=" + category + "]";
    }

    
}
