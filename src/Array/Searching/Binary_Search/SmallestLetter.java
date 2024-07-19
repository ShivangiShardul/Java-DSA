package Array.Searching.Binary_Search;

//LeetCode Question

class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','d','f'};
        char target = 'a';
        char index = nextGreatestletter(letters,target);

        System.out.println("Ceiling character of " + target + " is " + index);
    }

    static char nextGreatestletter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }

}
