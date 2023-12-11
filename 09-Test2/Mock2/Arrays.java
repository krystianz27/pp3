public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2) {
        int countArr1 = Arrays.countTwoDigitNumbers(arr1);
        int countArr2 = Arrays.countTwoDigitNumbers(arr2);

        return countArr1 == countArr2;
    }

    public static int countTwoDigitNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 10 && num <= 99) {
                count++;
            }
        }
        return count;
    }
}