import java.util.HashMap;
import java.util.Map;

public class Test {
    public static <K, V> Map<K, V> createMap(K key, V value) {
        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static void main(String[] args) {
        String key = "exampleKey";
        Integer value = 100;

        Map<String, Integer> result = createMap(key, value);

        System.out.println("Resulting Map:");
        System.out.println(result);
    }
}
