package POTD.GFG;
import java.util.HashMap;

class SubarraySum {
    public int longestSubarray(int[] arr, int k) {
        // HashMap to store the first occurrence of a cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize with cumulative sum 0 at index -1
        map.put(0, -1);

        int cumulativeSum = 0;
        int maxLength = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];  // Update cumulative sum

            // Check if there exists a subarray whose sum is equal to k
            if (map.containsKey(cumulativeSum - k)) {
                // Calculate the length of the subarray
                int subarrayLength = i - map.get(cumulativeSum - k);
                maxLength = Math.max(maxLength, subarrayLength);
            }

            // Store the first occurrence of the cumulative sum
            // We only store the first occurrence because we want the longest subarray
            if (!map.containsKey(cumulativeSum)) {
                map.put(cumulativeSum, i);
            }
        }

        return maxLength;  // Return the maximum length found
    }

    public static void main(String[] args) {
        SubarraySum solution = new SubarraySum();

        // Test case 1
        int[] arr1 = {10, 5, 2, 7, 1, -10};
        int k1 = 15;
        System.out.println("Test case 1: " + solution.longestSubarray(arr1, k1));  // Expected: 6

        // Test case 2
        int[] arr2 = {-5, 8, -14, 2, 4, 12};
        int k2 = -5;
        System.out.println("Test case 2: " + solution.longestSubarray(arr2, k2));  // Expected: 5

        // Test case 3
        int[] arr3 = {10, -10, 20, 30};
        int k3 = 5;
        System.out.println("Test case 3: " + solution.longestSubarray(arr3, k3));  // Expected: 0

        // Test case 4 (Empty array)
        int[] arr4 = {};
        int k4 = 0;
        System.out.println("Test case 4: " + solution.longestSubarray(arr4, k4));  // Expected: 0

        // Test case 5 (Single element)
        int[] arr5 = {5};
        int k5 = 5;
        System.out.println("Test case 5: " + solution.longestSubarray(arr5, k5));  // Expected: 1
    }
}

