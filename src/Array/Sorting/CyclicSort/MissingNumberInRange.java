package Array.Sorting.CyclicSort;

import java.util.Arrays;

//Amazon interview question
public class MissingNumberInRange {
    public static void main(String[] args) {
        int[] arr = {5,0,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
