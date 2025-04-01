package L6_Sliding_Window_And_Two_Pointer;

import java.util.HashMap;

public class Prblm5_Binary_Subarrays_With_Sum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        /*
            // BruteForce Approach: Time Complexity: O(N^2) & Space Complexity: O(1)
            int sum, count = 0;
            for(int i = 0; i < nums.length; i++){
                sum = 0;
                for(int j = i; j < nums.length; j++){
                    sum += nums[j];
                    if(sum == goal){
                        count++;
                    }
                }
            }
            return count;
        */

        // Solution 2: (Using HashMap) Time Complexity: O(N) & Space Complexity: O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - goal)) {
                count += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}
