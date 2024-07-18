package Array.Binary_Search;

class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-10, -6, -4, -1, 0, 2, 4, 7, 11, 23, 34, 50};
        int[] arr1 = {40, 35, 20, 17, 9, 4, 0, -1 , -4, -11, -22};
        int target = -1;
        int index = orderAgnosticBS(arr1,target);

        if (index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element is not in array");
        }
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
