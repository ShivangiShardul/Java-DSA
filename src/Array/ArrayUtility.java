package Array;

import java.util.Arrays;

public class ArrayUtility {
    public static void printArray(int[] arr){
//        int n = arr.length;

// Using For Each loop

//        for (int j : arr) {
//            System.out.println(j + " ");
//        }

// Using Simple for loop

//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }

// Using Stream
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println();

    }
}
