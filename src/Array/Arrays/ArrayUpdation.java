package Array.Arrays;

public class ArrayUpdation {

    public static void main(String[] args) {
        ArrayUpdation arrayUtil = new ArrayUpdation();

        arrayUtil.arrayDemo();
        arrayUtil.arrayDeclare();
    }

    void arrayDemo(){
        int[] myArray = new int[5];

        System.out.println("Initial");
        ArrayUtility.printArray(myArray);

        myArray[0] = 5;
        myArray[1] = 15;
        myArray[2] = 7;
        myArray[3] = 9;
        myArray[4] = 12;
   //   myArray[5] = 10;  //ArrayIndexOutOfBound Exception

        System.out.println("Before Updating");
        ArrayUtility.printArray(myArray);

        myArray[1] = 11;
        myArray[3] = 8;

        System.out.println("After Updating");
        ArrayUtility.printArray(myArray);

        System.out.println(myArray.length);
    }

    void arrayDeclare(){
        int[] arr = {11,22,33,44,55};

        System.out.println("\nDeclare the values while initialising");
        ArrayUtility.printArray(arr);
    }
}
