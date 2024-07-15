package Array;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Initial Array");
        ArrayUtility.printArray(arr);

        swapElements(arr,0,arr.length - 1);

//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }

        System.out.println("Reversal Array");
        ArrayUtility.printArray(arr);
    }

    public static void swapElements(int[] arr,int start,int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

    }
}
