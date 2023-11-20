import java.util.Arrays;
import java.util.HashSet;

public class C1 {

    public static int different(int[] array1, int[] array2) {
        int counter = 0;
        HashSet<Integer> indexesToRemove = new HashSet<>();

        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    indexesToRemove.add(counter);
                }
            }
            counter++;
        }
        return array1.length - indexesToRemove.size();
    }

    public static int secondMax(int[] array) {
        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(boxedArray));
        Integer[] array2 = new Integer[hashSet.size()];
        hashSet.toArray(array2);
        Arrays.sort(array2);
        int ndMax = array2[array2.length - 2];
        return ndMax;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 4, 5, 5, 6, 9, 9 };
        int[] arr2 = { 1, 2, 3, 4, 4, 9, 9 };

        System.out.println(different(arr1, arr2));
        System.out.println(secondMax(arr1));
    }
}