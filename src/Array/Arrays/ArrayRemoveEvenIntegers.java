package Array.Arrays;

public class ArrayRemoveEvenIntegers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Before Removing");
        ArrayUtility.printArray(arr);

        ArrayRemoveEvenIntegers removeEvenIntegers = new ArrayRemoveEvenIntegers();
        int[] newArray = removeEvenIntegers.removeEven(arr);

        System.out.println("After Removing");
        ArrayUtility.printArray(newArray);

//        Using Stream and Filter ,Lambda Expression
//        Arrays.stream(arr).filter(num -> (num % 2 == 1)).forEach(System.out::println);

    }

    private int[] removeEven(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
