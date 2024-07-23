package MathForDSA.BitwiseOperator;

class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr ={2,3,4,3,2,6,4};
        int[] arr1 ={-2,-3,4,3,2,7,-4};
        System.out.println(ans(arr));
        System.out.println(answer(arr1));
    }

    static int ans(int[] arr){
        //All Positive numbers
        int unique = 0;

        for (int i : arr) {
            unique ^= i;
        }
        return unique;
    }

    static int answer(int[] arr){
        //Mix numbers
        int unique = 0;

        for (int i : arr) {
            unique += i;
        }
        return unique;
    }
}
