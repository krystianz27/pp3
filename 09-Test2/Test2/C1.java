import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class C1 {

    public static int m1(int[] array1, int[]array2) {
        int counter = array1.length;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    counter --;
                }  
            } 
         }
         return counter;
    }


    public static int m2(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }

        ArrayList<Integer> array2 = new ArrayList<>();
        for (Integer integer : set) {
            array2.add(integer);
        }

        Collections.sort(array2);
        int secondMax = array2.get(array2.size()-2);
        System.out.println(array2);
        return secondMax;
        
    }
    

    // public static void main(String[] args) {
    //     int[] arr1 = {22,33,44,55};
    //     int[] arr2 = {44,55,66,77,88,99, 88,99};
    //     // System.out.println(C1.m2(arr2));
    //     System.out.println(m1(arr1, arr2));
    // }

}