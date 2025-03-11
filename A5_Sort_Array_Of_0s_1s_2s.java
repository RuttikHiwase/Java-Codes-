package L1_Arrays;

public class A5_Sort_Array_Of_0s_1s_2s {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
