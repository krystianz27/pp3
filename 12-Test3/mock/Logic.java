public class Logic {
    private boolean[] values;

    public Logic(boolean[] values) {
        this.values = values;
    }

    public int opposite() {
        int count = 0;
        for (int i = 1; i < values.length - 1; i++) {
            if ((values[i - 1] == values[i + 1]) && (values[i - 1] != values[i])) {
                count++;
            }
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        boolean[] arr1 = { true, false, false };
        boolean[] arr2 = { true, false, true, false };
        boolean[] arr3 = { true, false, true, true, false, true, false, true, false };

        Logic logic1 = new Logic(arr1);
        Logic logic2 = new Logic(arr2);
        Logic logic3 = new Logic(arr3);

        System.out.println(logic1.opposite()); // 0
        System.out.println(logic2.opposite()); // 2
        System.out.println(logic3.opposite()); // 5
    }
}
