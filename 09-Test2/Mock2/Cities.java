import java.util.ArrayList;
import java.util.List;

public class Cities {
    private String[] cityNames;

    public Cities(String[] names) {
        this.cityNames = names;
    }

    public Cities filter(char startChar) {
        List<String> filteredCities = new ArrayList<>();
        for (String city : cityNames) {
            if (city.charAt(0) == startChar) {
                filteredCities.add(city);
            }
        }
        return new Cities(filteredCities.toArray(new String[0]));
    }

    public String cities() {
        StringBuilder result = new StringBuilder();
        for (String city : cityNames) {
            result.append(city);
        }
        return result.toString();
    }

    // public static void main(String[] args) {
    // Cities cityList = new Cities(new String[] { "Warszawa", "Sopot", "Kielce",
    // "Szczecin", "Stargard" });
    // Cities filteredCities = cityList.filter('S');
    // System.out.println(filteredCities.cities());
    // System.out.println(filteredCities.cities().getClass().getSimpleName());
    // }
}
