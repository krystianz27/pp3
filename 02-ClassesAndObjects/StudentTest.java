public class StudentTest {    
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Peter";
        s1.age = 21;
        s1.studentID ="445344";
        s1.cardValidity = true;
        s1.semester = 3;
        s1.avgGrade = 4.52d;

        Student s2 = new Student();
        s2.name = "David";
        s2.age = 20;
        s2.studentID ="228659";
        s2.cardValidity = true;
        s2.semester = 5;
        s2.avgGrade = 4.86d;

        
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Student ID: " + s1.studentID);
        System.out.println("Semester " + s1.semester);
        System.out.println("Average grade " + s1.avgGrade);
        System.out.println("Status of student ID Card: " + ((s1.cardValidity) ? "Valid" : "Invalid"));

        s1.changeValidity(false);
        System.out.println(s1.cardValidity);

}
}
