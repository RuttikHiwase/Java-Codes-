package L6_Sliding_Window_And_Two_Pointer;

public class Prblm2_Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zeroCount = 0, max = Integer.MIN_VALUE;
        while(j < nums.length){
            if(nums[j] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[i] == 0){
                    zeroCount--;
                }
                i++;
            }
            max = Math.max(max, (j-i) + 1);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }
}
/*
Note:

 */
