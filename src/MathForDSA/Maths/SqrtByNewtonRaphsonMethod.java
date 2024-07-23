package MathForDSA.Maths;

import java.util.Scanner;

//Some error
public class SqrtByNewtonRaphsonMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter the number to check : ");
        int num = input.nextInt();

        double root = sqrt(num);
        System.out.printf("Square root of %d is %.3f",num,root);
    }

    static double sqrt(double num){
        double x = num;

        double root;
        while (true){
            root = 0.5 + (x + (num/x));

            if (Math.abs(root - x) < 1){
                break;
            }

            x = root;
        }

        return root;
    }
}
