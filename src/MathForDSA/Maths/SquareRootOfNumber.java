package MathForDSA.Maths;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter the number to check : ");
        int num = input.nextInt();

        int p = 3;

        double root = sqrt(num,p);
        System.out.printf("Square root of %d is %.3f",num, root);
    }

    // O(log n)
    static double sqrt(int num, int p){
        int s = 0;
        int e = num;

        double root = 0.0;

        while (s <= e){
            int m = s + ( e -s ) / 2;

            if (m * m == num){
                return m;
            }

            if (m * m > num){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
