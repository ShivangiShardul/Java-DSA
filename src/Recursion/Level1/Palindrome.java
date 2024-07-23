package Recursion.Level1;

import java.util.Scanner;

public class Palindrome {
    private static int reverse2(int num){
        int digits = (int) (Math.log10(num)) + 1;
        return helper(num,digits);
    }

    private static int helper(int num, int digits) {
        if (num % 10 == num){
            return num;
        }
        int rem = num % 10;
        return rem * (int) Math.pow(10,digits-1) + helper(num/10,digits-1);
    }

    static boolean palin(int num){
        return num == reverse2(num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Palindrome Checker");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println(palin(num));
    }
}
