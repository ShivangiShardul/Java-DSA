package Array.Searching.Binary_Search;

import java.util.Arrays;

class FindFirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,4,4,5,6};
        int target = 4;

        int[] ans = searchRange(arr ,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target){
       int[] ans = {-1, -1};

        ans[0] = search(nums,target,true);
        if (ans[0] != -1){
            ans[1] = search(nums,target,false);
        }

       return ans;
    }

    static int search(int[] nums, int target, boolean findingStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                ans = mid;
                if(findingStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
