package MathForDSA.BitwiseOperator;

import java.util.Scanner;

class FindithBitOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ith Bit Finder");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.print("Which bit to find : ");
        int bitNum = input.nextInt();

        int bit = bitFinder(num,bitNum);
        System.out.println(bit);

    }

    private static int bitFinder(int num,int n) {
        return num & (1 << (n - 1)) << (n - 1);
    }
}
