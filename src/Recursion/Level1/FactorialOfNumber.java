package Recursion.Level1;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Printing the Factorial of Number");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("Factorial is " + fact(num));
    }

    private static int fact(int num) {
        if(num <= 1){
            return 1;
        }

        return num * fact(num-1);
    }
}
