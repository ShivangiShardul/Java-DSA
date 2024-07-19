package Array.Searching.Binary_Search;

class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9, 4, 0, -1};
        int target = 3;

        int element = search(arr,target);
        System.out.println("Found at index " + element);
    }

    static int search(int[] arr, int target){
        int peak = peakInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(arr,target,peak+1, arr.length - 1);
    }

    static int peakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] arr,int target, int start, int end){
        boolean isAsnc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsnc){
                if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
