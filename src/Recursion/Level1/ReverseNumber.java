package Recursion.Level1;

import java.util.Scanner;

class ReverseNumber {
    static int sum = 0;
    private static void reverse1(int num){
        if (num == 0){
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverse1(num / 10);
    }

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Reverse the Number");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        reverse1(num);
        System.out.println("Reverse by Method 1 : " + sum);
        System.out.println("Reverse by Method 2 : " + reverse2(num));
    }

}
