package Array.Linear_Search;

class LinearSearch {
//    Time Complexity - O(1) Best case - O(n) Worst case

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int ans = linearSearch(arr,6);
        System.out.println(ans);

//        boolean ans1 = linearSearch1(arr,8);
////        System.out.println(ans1);
//
//        if (ans1){
//            System.out.print("Element is found in array");
//        } else {
//            System.out.print("Element is not in array");
//        }
    }

    //search in the array return the index if found otherwise return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }

        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        return -1;
    }


//    static boolean linearSearch1(int[] arr, int target){
//        if (arr.length == 0){
//            return false;
//        }
//
//        for (int element : arr) {
//            if (element == target){
//                return true;
//            }
//        }
//        return false;
//    }
}
