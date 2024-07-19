package Array.Searching.Binary_Search;

import java.util.Arrays;

class RowColumnMatrix {
    public static void main(String[] args) {
        //matrix is sorted in row wise and column wise
        // Time Complexity : O(n) , Space Complexity : O(1)
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(search(arr,49)));
    }

    static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }

            if (matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
