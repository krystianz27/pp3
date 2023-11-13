import java.time.Year;

public class Test {
    public static void main(String[] args) {
        Integer year = Year.now().getValue();
        System.out.println(year);
    }

}
