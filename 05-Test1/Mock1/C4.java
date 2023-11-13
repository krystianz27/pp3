public class C4 {
    public static int even(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int positiveOdd(int[] arr) {
        int counter = 0;
        for (int i : arr) {
            if (i % 2 == 1 && i >= 1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, -6, 5, 8 };
        int[] arr2 = { 3, 2, -5, 4, 1, -7 };
        System.out.println(C4.even(arr1));
        System.out.println(C4.even(arr2));
        System.out.println(C4.positiveOdd(arr1));
        System.out.println(C4.positiveOdd(arr2));
    }

}
