import java.util.Arrays;

public class C3 {
    public static boolean isAlphabet(String t) {
        char[] c = t.toCharArray();
        Arrays.sort(c);
        String newString = new String(c);
        return newString.equals(t);
    }

    public static String hideText(String t) {
        String newString;
        if (t.length() <= 2) {
            newString = t;
        } else {
            newString = t.substring(0, 1);
            for (int i = 1; i < t.length() - 1; i++) {
                newString += "*";
            }
            newString += t.substring(t.length() - 1);
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.hideText("ac"));

    }
}
