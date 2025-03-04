package Array.Sorting.CyclicSort;

// Space Complexity = O(1) , Time Complexity = Worst case : O(n)  Comparisons - (2*n - 1)
// Use this sort when 1 to N range is given

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
