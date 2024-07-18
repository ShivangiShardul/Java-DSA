package Array.Linear_Search;

class SearchInRange {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,6,7,8};
        int[] arr1 = {18,12,-7,3,14,38};
//        int ans = searchRange(arr,2,5,7);
        int ans = searchRange(arr1,2,5,38);

        if (ans == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }

    }

    static int searchRange(int[] arr, int start, int end,int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
