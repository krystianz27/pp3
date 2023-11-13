public class MyArrays {
    public static int odd(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i > 0 && i % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static double above(int[] array) {
        int sum = 0;
        double mean;
        for (int i : array) {
            sum += i;
        }
        int newSum = 0;
        mean = sum / array.length;
        for (int i : array) {
            if (i > mean) {
                newSum += i;
            }
        }

        return newSum;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 2, -5, 4, 1, -7 };
        int[] arr2 = { 5, 2, 7, 4, 2 };
        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));
    }
}
