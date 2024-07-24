package Recursion.Sorting;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,4,7,8,2,1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int row, int col){
        if (row == 0){
            return;
        }

        if (col < row){
            if (arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr,row,col+1);
        } else {
            bubbleSort(arr,row-1,0);
        }
    }
}
