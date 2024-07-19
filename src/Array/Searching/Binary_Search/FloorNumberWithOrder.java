package Array.Searching.Binary_Search;

public class FloorNumberWithOrder {
    public static void main(String[] args) {
        int[] arr = {-10, -6, -3, -1, 0, 2, 4, 7, 11, 23, 34, 50};
        int[] arr1 = {40, 35, 20, 17, 9, 4, 0, -1 , -4, -11, -22};
        int target = 3;

        floorNumber(arr1,target);
        floorNumber(arr,target);
    }

    static void floorNumber(int[] arr1, int target){
        int index;

        int start = 0;
        int end = arr1.length - 1;

        boolean isAsc = arr1[start] < arr1[end];

        if (isAsc){
            index = arrayIsAsc(arr1,start,end,target);
        } else {
            index = arrayIsDes(arr1,start,end,target);
        }

        if (index == -1) {
            System.out.println("Floor number of " + target + " is " + index + " because the number is not present in array");
        } else {
            System.out.println("Floor number of " + target + " is " + arr1[index]);
        }
    }

    static int arrayIsAsc(int[] arr,int start, int end, int target){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return end;
    }

    static int arrayIsDes(int[] arr,int start, int end, int target) {
        if (target < arr[arr.length - 1]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
