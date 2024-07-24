package Recursion.Arrays;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,6,1,8};
        int target = 6;

        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexfromLast(arr,target,arr.length-1));
    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexfromLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }

        if (arr[index] == target){
            return index;
        } else {
            return findIndexfromLast(arr, target, index - 1);
        }
    }
}
