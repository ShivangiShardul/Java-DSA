package Recursion.Level1;

import java.util.Scanner;

class ProductOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Product oF Digits Calculator");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("Product of Digits is " + productOfDigits(num));
    }

    private static int productOfDigits(int n){
        if (n % 10 == n){
            return n;
        }

        return (n % 10) * productOfDigits(n/10);
    }
}
