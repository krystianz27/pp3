import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class C4 {
    int[] grades;

    public C4(int[] grades) {
        this.grades = grades;
    }

    public int m() {

        ArrayList<Integer> array2 = new ArrayList<>();
        for (Integer integer : grades) {
            array2.add(integer);
        }

        Collections.sort(array2);;
        System.out.println(array2);

        array2.remove(0);
        array2.remove(array2.size()-1);
        int grades_sum = 0;

        for (Integer integer : array2) {
            grades_sum += integer;
        }
        return grades_sum;
    }


    // public static void main(String[] args) {
    //     int[] gr = {4,5,3,3,5,2,2,4};
    //     C4 obj = new C4(gr);
    //     System.out.println(obj.m());
    // }

}
