public class Student {
    String name;
    int age;
    String studentID;
    boolean cardValidity;
    int semester;
    double avgGrade;

    void sayHello(){
        System.out.println("Hello from "+name);
    }

    void displayName(){
    System.out.println("Hello my name is " + name );
    }

    void displayAge(){
    System.out.println("I am "+ age + " years old.");
    }

    void changeValidity(boolean value){
    cardValidity = value;
    }

}
