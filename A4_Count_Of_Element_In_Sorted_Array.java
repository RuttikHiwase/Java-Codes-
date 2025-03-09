package L3_BinarySearch;

public class A4_Count_Of_Element_In_Sorted_Array {
    public static void main(String[] args) {
         /*
       class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        int ans = last - first +1;
        return ans;
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
//Note:
//Approch :
// 1.use logic of first and last occurance of element
//2.then  ans = firstEle - LastEle + 1
//3.return ans;