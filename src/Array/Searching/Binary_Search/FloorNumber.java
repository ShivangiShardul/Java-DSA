package Array.Searching.Binary_Search;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {-10, -6, -4, -1, 0, 2, 4, 7, 11, 23, 34, 50};
        int target = 5;
        int index = floorNumber(arr,target);

        if (index == -1) {
            System.out.println("Floor number of " + target + " is " + index + " because the number is not present in array");
        } else {
            System.out.println("Floor number of " + target + " is " + arr[index]);
        }
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
