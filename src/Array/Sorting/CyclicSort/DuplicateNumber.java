package Array.Sorting.CyclicSort;

import java.util.Arrays;

// Amazon Question
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicateNumbers(arr));
    }

    static int findDuplicateNumbers(int[] arr){
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
}
