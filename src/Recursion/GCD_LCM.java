package Recursion;

import java.util.Scanner;

class GCD_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to GCD and LCM Calculator");

        System.out.print("Enter number 1 : ");
        int num = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num1 = input.nextInt();

        System.out.println("GCD of " + num + " and " + num1 + " is " + gcd(num,num1));
        System.out.println("LCM of " + num + " and " + num1 + " is " + lcm(num,num1));
    }

    //Euclidean Algorithm
    private static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        return gcd(b%a,a);
    }

    private static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
