package MathForDSA.Maths;

import java.util.Scanner;

//Sieve of Eratosthenes
public class PrimeNumbersTillRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker");
        System.out.print("Enter the number to check : ");
        int range = input.nextInt();

        boolean[] primes = new boolean[range+1];
        primeNumbers(range,primes);
    }

    static void primeNumbers(int n, boolean[] primes){
        for (int i = 2; i * i <= n ; i++) {
            if (!primes[i]){
                for (int j = i*2; j <= n ; j+= i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
