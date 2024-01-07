import java.util.HashSet;
import java.util.Set;

public class StringToHashSet {

    public static Set<Character> stringToHashSet(String text) {
        Set<Character> characterSet = new HashSet<>();
        for (char ch : text.toCharArray()) {
            characterSet.add(ch);
        }
        return characterSet;
    }

    // Example usage
    public static void main(String[] args) {
        Set<Character> hashSet = stringToHashSet("Example String");
        System.out.println(hashSet); // This will print the HashSet of characters
    }
}
