package L3_BinarySearch;

public class A11_Infinite_Array {
    public static void main(String[] args) {
        // Example test case: an array with the first occurrence of '1' at index 3
        int[] arr = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1};

        // Initializing low and high for the range
        int low = 0;
        int high = 1;

        // Step 1: Find the range where the target '1' might be
        while (arr[high] < 1) {
            low = high;
            high = high * 2;
            // Ensure we don't go out of bounds
            if (high >= arr.length) {
                high = arr.length - 1;
                break;
            }
        }

        // Step 2: Binary search to find the first occurrence of '1' in the range [low, high]
        int res = -1;  // To store the result (index of the first occurrence)
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                res = mid;  // Record the index when the target '1' is found
                high = mid - 1;  // Continue searching on the left side to find the first occurrence
            } else if (arr[mid] < 1) {
                low = mid + 1;  // Target is on the right side
            } else {
                high = mid - 1;  // Target is on the left side
            }
        }

        // Output the result
        if (res != -1) {
            System.out.println("First occurrence of 1 is at index: " + res);
        } else {
            System.out.println("1 not found in the array");
        }
    }
}
