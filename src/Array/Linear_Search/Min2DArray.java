package Array.Linear_Search;

class Min2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 134, 56},
                {18, 12}
        };

        int min = min(arr);
        System.out.println("Max number is " + min);
    }

    static int min(int[][] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] > max){
//                        max = arr[row][col];
//                }
//            }
//        }

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
