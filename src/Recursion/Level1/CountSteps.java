package Recursion.Level1;

import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Counting Steps");

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int steps = numberOfSteps(num);
        System.out.println("No of steps is : " + steps);
    }

    static int numberOfSteps(int num){
        return helper(num , 0);
    }

    static int helper(int num, int steps){
        if (num == 0){
            return steps;
        }

        if (num % 2 == 0){
            return helper(num/2, steps+1);
        }
        return helper(num-1,steps+1);
    }
}
