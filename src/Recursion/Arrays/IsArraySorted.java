package Recursion.Arrays;

class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8};
        int[] arr1 = {3,2,5,4,6};
        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr1,0));
    }

    static boolean isSorted(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr,index+1);
    }
}
