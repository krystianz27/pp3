import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyArray {
    public static int[] reverse(int[] array) {
        ArrayList<Integer> reversedArray = new ArrayList<>();
        for (int i : array) {
            reversedArray.add(0, i);
        }
        int[] array2 = new int[array.length];
        Arrays.setAll(array2, reversedArray::get);
        return array2;
    }

    public static boolean different(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean exist(int number, int[] array) {

        // Integer[] array1 = new Integer[array.length];
        // Arrays.setAll(array1, i -> array[i]);

        // This is the best native way
        Integer[] array1 = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // Integer[] arr1 = new Integer[arr1.length];
        // int i = -0;
        // for (int num : arr1) {
        // arr1[i++] = Integer.valueOf(num);

        return Arrays.asList(array1).contains(number);
    }

    public static int secondMax(int[] array) {
        int scMax = 0;
        // This line or those 2
        // IntStream.of(array).boxed().collect(Collectors.toCollection(ArrayList::new));

        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Collections.addAll(arrList, boxedArray);
        Collections.sort(arrList);
        scMax = arrList.get(arrList.size() - 2);
        return scMax;
    }

    public static int lastColumn(int[][] array) {
        int sum = 0;
        for (int[] m : array) {
            sum += m[m.length - 1];
        }
        return sum;
    }

    public static int[][] swap(int[][] array) {
        for (int[] m : array) {
            int firstPlace = m[0];
            m[0] = m[m.length - 1];
            m[m.length - 1] = firstPlace;
        }
        return array;
    }

    public static int[] two2one(int[][] array) {
        int[] newArray = Stream.of(array).flatMapToInt(IntStream::of).toArray();
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 9, 13, 29, 10, 11, 28 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 9, 15, 17, 30, 28, 11 };
        int[][] arr3 = { arr1, arr2 };
        // System.out.println(MyArray.reverse(arr1));
        // int[] arr3 = MyArray.reverse(arr1);
        // System.out.println(Arrays.toString(MyArray.reverse(arr1)));
        // System.out.println(MyArray.different(arr1, arr2));
        // System.out.println(MyArray.exist(4, arr2));
        // System.out.println(MyArray.secondMax(arr1));\
        // System.out.println(MyArray.lastColumn(arr3));
        // System.out.println(Arrays.deepToString(MyArray.swap(arr3)).replace("], ",
        // "]\n"));
        System.out.println(Arrays.toString(MyArray.two2one(arr3)));
    }
}
