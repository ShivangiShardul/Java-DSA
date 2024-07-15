package Array;

public class ArraySecondMaxNum {
    public static void main(String[] args) {
        int[] arr = {12,23,4,33,5,164,90,7};
        int[] arr1 = {2,-23,64,3,75,-4,-90,17};
        int[] arr2= {100,44,76,128,775,43,999};
        int[] arr3 = {20,20,20,20};
        int[] arr4 = {};

        System.out.println("Second Max number in array is " + secondMaxNumber(arr));
        System.out.println("Second Max number in array is " + secondMaxNumber(arr1));
        System.out.println("Second Max number in array is " + secondMaxNumber(arr2));
        System.out.println("Second Max number in array is " + secondMaxNumber(arr3));
        System.out.println("Second Max number in array is " + secondMaxNumber(arr4));
    }

    public static int secondMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
