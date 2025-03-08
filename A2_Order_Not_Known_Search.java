package L3_BinarySearch;

public class A2_Order_Not_Known_Search {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 4;
        System.out.println(solve(arr, k));
    }

    static int solve(int arr[], int k) {
        int n = arr.length;
        if (n == 1) {
            return arr[0] == k ? 0 : -1;
        }
        boolean isAscending = false;
        if (arr[0] < arr[n - 1]) {
            isAscending = true;
        }

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (isAscending == true && k < arr[mid]) {
                end = mid - 1;
            } else if (isAscending == false && k < arr[mid]) {
                start = mid + 1;
            } else if (isAscending == true && k > arr[mid]) {
                start = mid + 1;
            } else if (isAscending == false && k > arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

}


//Given a sorted array of numbers, find if a given number ‘key’
// is present in the array. Though we know that the array is sorted,
// we don’t know if it’s sorted in ascending or descending order. .
