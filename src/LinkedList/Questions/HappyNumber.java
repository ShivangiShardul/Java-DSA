package LinkedList.Questions;

// leetcode google
class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }

    private static int findSquare(int num){
        int ans = 0;

        while (num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num = num / 10;
        }
        return ans;
    }
}
