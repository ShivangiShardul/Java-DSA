package Array;

public class ArrayMoveZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = { 1,4,0,2,3,0,6};

        ArrayUtility.printArray(arr);
        ArrayUtility.printArray(moveZeros(arr));
    }

    public static int[] moveZeros(int[] arr){
        int j = 0;          // focus on zero element
        for (int i = 0; i < arr.length; i++) { // i focuses on non-zero element
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0){
                j++;
            }
        }
        return arr;
    }
}
