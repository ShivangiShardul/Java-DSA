package Array.Linear_Search;

// Leetcode = Richest customer wealth

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        int[][] accounts1 = {
                {1, 2, 3, 4},
                {3, 2, 4 ,5},
                {0, 1 ,1, 2}
        };

        int money = maximumWealth(accounts1);

        System.out.println(money);
    }


    static int maximumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
