package L3_BinarySearch;

public class A5_Number_Of_Time_Sorted_Array_Is_Rotated {
    public static void main(String[] args) {
        /*
        public class RotatedArray {

    // Function to find the rotation count in a rotated sorted array
    public static int findRotationCount(int[] A) {
        int n = A.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid element is the minimum (rotation count)
            if (A[mid] < A[(mid - 1 + n) % n] && A[mid] < A[(mid + 1) % n]) {
                return mid;
            }
            // If middle element is greater than the rightmost element, the minimum is in the right part
            else if (A[mid] > A[end]) {
                start = mid + 1;
            }
            // If middle element is less than or equal to the rightmost element, the minimum is in the left part
            else {
                end = mid - 1;
            }
        }

        return 0; // This is the case when the array is not rotated
    }
    }
}

         */

    }
}
/*
Note:
1.To find the number of rotation done on sorted array.
2.find the index of smallest element , that will be our Ans.
3. if (A[mid] < A[(mid - 1 + n) % n] && A[mid] < A[(mid + 1) % n]) {
                return mid;
4.This logic will check mid element is greater than prev ele and mid is small than next ele.
 */
