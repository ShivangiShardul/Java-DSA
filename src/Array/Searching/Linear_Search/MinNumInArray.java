package Array.Searching.Linear_Search;

class MinNumInArray {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,38};

        int min = minNum(arr);
        System.out.println("Minimum number in array is " + min);
    }

    static int minNum(int[] arr){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min){
                min = num;
            }
        }
        return min;
    }
}
