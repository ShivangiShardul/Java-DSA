package Array;

public class ArrayFindingMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2};
        int[] arr1 = {1,8,4,5,2,3,6,9};
        int[] arr2 = {1,7,3,2,5,4};

        System.out.println("Missing number is " + findMissingNum(arr));
        System.out.println("Missing number is " + findMissingNum(arr1));
        System.out.println("Missing number is " + findMissingNum(arr2));

    }

    public static int findMissingNum(int[] arr){
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }
}
