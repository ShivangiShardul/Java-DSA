package Recursion.Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,11,22,45,78};
        int target = 78;
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
        System.out.println(binarySearch(arr,target,0,arr.length - 1));
    }

    static int binarySearch(int[] arr,int target,int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + ( end - start ) / 2;

        if (arr[mid] == target){
            return mid;
        }

        if (target > arr[mid]){
            return binarySearch(arr,target,mid+1,end);
        }

        return binarySearch(arr,target,start,mid-1);
    }
}
