package Recursion.Arrays;

import java.util.ArrayList;

class FindAllTheIndex {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,6,6,1,8};
        int target = 6;

//        findAllIndex(arr,target,0);
//        System.out.println(list);

//        ArrayList<Integer> ans = findAllIndex(arr,target,0,new ArrayList<>());
//        System.out.println(ans);

//        ArrayList<Integer> list =  new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr,target,0,list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex(arr,target,0));
    }


    //  ------------------ Using Static ArrayList  ----------------------- //

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int index){
//        if (index == arr.length){
//            return;
//        }
//
//        if (arr[index] == target){
//            list.add(index);
//        }
//            findAllIndex(arr, target, index + 1);
//    }

    //  ------------------ Passing ArrayList as parameter ----------------------- //
    //Return an ArrayList
//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
//        if (index == arr.length){
//            return list;
//        }
//
//        if (arr[index] == target){
//            list.add(index);
//        }
//        return findAllIndex(arr, target, index + 1,list);
//    }

      //  ------------------ Passing ArrayList as parameter ----------------------- //
//    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
//        if (index == arr.length){
//            return list;
//        }
//
//        if (arr[index] == target){
//            list.add(index);
//        }
//        return findAllIndex(arr, target, index + 1,list);
//    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        //This will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromAboveCalls = findAllIndex(arr, target, index + 1);

        list.addAll(ansFromAboveCalls);
        return list;
    }
}
