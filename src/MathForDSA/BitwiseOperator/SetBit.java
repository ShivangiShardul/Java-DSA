package MathForDSA.BitwiseOperator;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Set Bit");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBit(num));
    }

    private static int setBit(int n){
        int count = 0;

        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
