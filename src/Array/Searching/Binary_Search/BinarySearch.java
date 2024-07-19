package Array.Searching.Binary_Search;

class BinarySearch {
   // Time Complexity = O(log n)

   // here we assume the array is already sorted in ascending order

    public static void main(String[] args) {
        int[] arr = {-10,-6,-4,-1,0,2,4,7,11,23,34,50};
        int target = -1;
        int index = binarySearch(arr,target);

        if (index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element is not in array");
        }
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
