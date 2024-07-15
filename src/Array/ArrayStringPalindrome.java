package Array;

public class ArrayStringPalindrome {
    public static void main(String[] args) {
        String str = "nitin";
        String str1 = "mansi";

        boolean value = isPalindrome(str1);
        if (value){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while (start < end){
            if (chars[start] != chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
