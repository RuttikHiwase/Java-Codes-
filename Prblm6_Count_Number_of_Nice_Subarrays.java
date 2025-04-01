package L6_Sliding_Window_And_Two_Pointer;
/*
   1248. Count Number of Nice Subarrays
   Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

   Return the number of nice sub-arrays.



   Example 1:
   Input: nums = [1,1,2,1,1], k = 3
   Output: 2
   Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

   Example 2:
   Input: nums = [2,4,6], k = 1
   Output: 0
   Explanation: There is no odd numbers in the array.

   Example 3:
   Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
   Output: 16
 */
public class Prblm6_Count_Number_of_Nice_Subarrays {
    /*
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 1;
        int ans = 0, odd = 0;
        for (int num : nums) {
            odd += num & 1;
            if (odd - k >= 0) {
                ans += cnt[odd - k];
            }
            cnt[odd]++;
        }
        return ans;
     */
}
