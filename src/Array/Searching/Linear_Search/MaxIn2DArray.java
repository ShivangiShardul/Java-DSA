package Array.Searching.Linear_Search;

class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23 ,4 ,1},
                {18 , 12, 3, 9},
                {78, 99, 134, 56},
                {18, 12}
        };

        int max = max(arr);
        System.out.println("Max number is " + max);
    }

    static int max(int[][] arr){
        if (arr.length == 0){
                return Integer.MIN_VALUE;
        }

        int max = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max){
//                        max = arr[row][col];
//                }
//            }
//        }

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

