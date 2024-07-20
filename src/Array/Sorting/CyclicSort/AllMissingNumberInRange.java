package Array.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Google Question
public class AllMissingNumberInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,7,8};
        System.out.println(Arrays.toString(arr));

        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

}
