package Array.Searching.Binary_Search;

class PeakInMountain {
    // Peak index in a mountain array
    // find peak element;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9, 4, 0, -1};

        int peak = peakIndexInMountainArray(arr);

        System.out.println("Peak element is " + arr[peak]);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
