package Recursion.Level1;

import java.util.Scanner;

public class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Printing the Numbers in Reverse");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        printingRangeInReverse(num);
        System.out.println();
        printingRange(num);
        System.out.println();
        printingBoth(num);
    }

    // n to 1
    private static void printingRangeInReverse(int num){
        if (num == 0){
            return;
        }

        System.out.print(num + " ");
        printingRangeInReverse(num - 1);
    }

    private static void printingRange(int num){
        if (num == 0){
            return;
        }

        printingRange(num - 1);
        System.out.print(num + " ");
    }

    private static void printingBoth(int num){
        if (num == 0){
            return;
        }

        System.out.print(num + " ");
        printingBoth(num - 1);
        System.out.print(num + " ");
    }
}
