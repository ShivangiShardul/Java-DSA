package Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] arr = {12,23,4,33,5,64,90,7};
        int[] arr1 = {2,-23,64,3,75,-4,-90,17};
        int[] arr2= {100,44,76,128,775,43,999};
        int[] arr3 = {20,63,8,0,25,9,97};
        int[] arr4 = {};

//        OptionalInt minNum = Arrays.stream(arr).min();
//        System.out.println("Min number in array is " + minNum);

        System.out.println("Min number in array is " + minNumber(arr));
        System.out.println("Min number in array is " + minNumber(arr1));
        System.out.println("Min number in array is " + minNumber(arr2));
        System.out.println("Min number in array is " + minNumber(arr3));
        System.out.println("Min number in array is " + minNumber(arr4));
    }

    public static int minNumber(int[] arr){
        if (arr == null || arr.length ==0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
