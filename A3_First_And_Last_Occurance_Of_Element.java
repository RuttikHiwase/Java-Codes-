package L3_BinarySearch;


public class A3_First_And_Last_Occurance_Of_Element {
    public static void main(String[] args) {
       /*
       class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[] { first, last };
    }

    private int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                pos = mid;
                if (findFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return pos;
    }
}
        */
    }
}

/*
Note:
1.we need to find first occurance and last occurance
 if (nums[mid] == target) {
                pos = mid;
                if (findFirst)
                    right = mid - 1;
                else
                    left = mid + 1;

2.this code will we work as per boolean value provide by user, if bool is true ,then
we search element at left side of array to find fisrt occurance.
3.if bool is false we will search at right side of arry
 */
