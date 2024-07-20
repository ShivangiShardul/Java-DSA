package Array.Sorting;

// Space Complexity = O(1) , Time Complexity = Best case : O(n) , Worst case : O(n*n)
// Stable algo(does not change original order of elements)
// No of Comparison = Best case : (n-1) , Worst case : (n*(n-1))/2
// Used mostly when array is partially sorted

import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
