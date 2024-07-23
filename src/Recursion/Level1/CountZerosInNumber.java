package Recursion.Level1;

import java.util.Scanner;

public class CountZerosInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Counting Zeroes in Number");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int count = count(num);
        System.out.println("No of zeroes is : " + count);
    }

    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count){
        if(n == 0){
            return count;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
