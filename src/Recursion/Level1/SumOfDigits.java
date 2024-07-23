package Recursion.Level1;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sum oF Digits Calculator");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("Sum of Digits is " + sumOfDigits(num));
    }

    private static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigits(n/10);
    }
}
