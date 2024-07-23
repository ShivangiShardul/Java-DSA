package MathForDSA.Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factorial(20);
    }

//    // O(sqrt(n))
//    static void factorial(int num){
//        for (int i = 1; i <= Math.sqrt(num); i++) {
//            if (num % i == 0){
//                if (num/ i == i){
//                    System.out.print(i);
//                } else {
//                    System.out.print(i + " " + num / i + " ");
//                }
//            }
//        }
//    }

    // O(sqrt(n)) both time and space complexity
    static void factorial(int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                if (num/ i == i){
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                    list.add(num/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    // O(n)
//    static void factorial(int num){
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
}
