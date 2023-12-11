import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Numbers {
    int a, b, c, d, e;
    ArrayList<Integer> numbersList;

    public Numbers(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.numbersList = new ArrayList<Integer>(Arrays.asList(a, b, c, d, e));
    }

    public boolean different() {
        // ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(a, b, c, d,
        // e));
        int firstLength = numbersList.size();
        HashSet<Integer> numbersSet = new HashSet<>(numbersList);
        int secondLength = numbersSet.size();
        return firstLength == secondLength ? true : false;
    }

    // public static void main(String[] args) {
    // Numbers n1 = new Numbers(1, 2, 3, 4, 5);
    // System.out.println(n1.different());
    // }
}
