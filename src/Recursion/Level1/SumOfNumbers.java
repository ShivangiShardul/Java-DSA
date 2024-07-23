package Recursion.Level1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sum Calculator");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("sum is " + sum(num));
    }

    private static int sum(int num) {
        if(num <= 1){
            return 1;
        }

        return num + sum(num-1);
    }
}
