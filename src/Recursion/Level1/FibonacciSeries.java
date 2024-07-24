package Recursion.Level1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num= 5;
        for (int i = 0; i <= 5; i++) {
            System.out.println(fibo(i));
        }

        System.out.println();
        System.out.println(fiboFormula(5));
    }

    static long fiboFormula(int n){
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
