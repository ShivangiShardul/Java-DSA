package MathForDSA.Maths;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter the number to check : ");
        int num = input.nextInt();

        if (isPrime(num)){
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    private static boolean isPrime(int num) {
        if (num <= 2){
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }

//        int c = 2;
//        while (c * c <= num){
//            if (num % c == 0){
//                return false;
//            }
//            c++;
//        }
        return true;
    }
}
