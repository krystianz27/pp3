import java.util.HashSet;
import java.util.Set;

public class Isogram {

    public static boolean isogram(String text) {
        Set<Character> seenCharacters = new HashSet<>();
        for (char ch : text.toCharArray()) {
            if (ch != ' ') { // Ignore spaces
                if (seenCharacters.contains(ch)) {
                    return false; // Duplicate character found
                }
                seenCharacters.add(ch);
            }
        }
        return true; // No duplicates found, hence an isogram
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isogram("red sun")); // true
        System.out.println(isogram("blue water")); // false
        System.out.println(isogram("BLUE water")); // true
        System.out.println(isogram("my blue water")); // false
    }
}
