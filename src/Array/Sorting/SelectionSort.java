package Array.Sorting;

import java.util.Arrays;

// Space Complexity = O(1) , Time Complexity = Best case : O(n*n) , Worst case : O(n*n)
// In place sort , Not Stable algo(do change original order of elements)

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxNum = maxIndex(arr,0,last);

           swap(arr,maxNum,last);
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
