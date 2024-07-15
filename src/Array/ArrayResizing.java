package Array;

public class ArrayResizing {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6};

        System.out.printf("The size of original Array is %d\n",arr.length);
        ArrayUtility.printArray(arr);

        arr = resize(arr, arr.length*2);
        System.out.printf("The size of New Resize Array is %d\n",arr.length);
        ArrayUtility.printArray(arr);
    }

    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
//        arr = temp;
        return temp;
    }
}
