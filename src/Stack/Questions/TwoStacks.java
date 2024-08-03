package Stack.Questions;

import java.util.Arrays;
import java.util.Scanner;

class TwoStacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the how many test cases you want : ");
        int testCase = s.nextInt();

        for (int i = 0; i < testCase; i++) {
            System.out.print("Enter the size of array one : ");
            int m = s.nextInt();
            System.out.print("Enter the size of array two : ");
            int n = s.nextInt();
            System.out.print("Enter the sum : ");
            int sum = s.nextInt();

            int[] a = new int[m];
            int[] b = new int[n];

            System.out.println("Enter the elements of a");
            for (int j = 0; j < m; j++) {
                a[j] = s.nextInt();
            }

            System.out.println("Enter the elements of b");
            for (int j = 0; j < n; j++) {
                b[j] = s.nextInt();
            }
            System.out.println("Answer is : "+ twoStacks(sum,a,b));
        }
    }

    static int twoStacks(int x , int[] a, int[] b){
        return twoStacks(x,a,b,0,0) - 1;
    }

    private static int twoStacks(int x , int[] a, int[] b,int sum,int count){
        if (sum > x){
            return count;
        }

        if (a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum + a[0],count + 1);
        int ans2 = twoStacks(x, a,Arrays.copyOfRange(b,1,b.length),sum + b[0],count + 1);

        return Math.max(ans1,ans2);
    }
}
