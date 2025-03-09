package L3_BinarySearch;

public class A7_Find_Floor_Of_Element_In_Sorted_Array {


        // Function to find the floor of x in the sorted array arr
        public static int findFloor(int[] arr, int x) {
            int start = 0, end = arr.length - 1;
            int floor = -1;  // Initialize floor as -1 to handle case when no floor exists

            // Perform binary search
            while (start <= end) {
                int mid = (start + end) / 2;

                // If we find the exact match
                if (arr[mid] == x) {
                    return arr[mid];
                }

                // If the mid element is less than or equal to x, it's a potential floor
                if (arr[mid] < x) {
                    floor = arr[mid];
                    start = mid + 1;  // Search the right half for a potentially larger floor
                }
                // If the mid element is greater than x, search the left half
                else {
                    end = mid - 1;
                }
            }

            return floor;  // Return the largest element smaller than or equal to x
        }

        // Main function for testing
        public static void main(String[] args) {
            int[] arr = {1, 2, 8, 10, 10, 12, 19};
            int x = 5;

            System.out.println("Floor of " + x + " is: " + findFloor(arr, x));  // Expected output: 2
        }
    }


/*
Note:
1.Floor of element means return target element idx
// eg arr= 2 3 4 6 7 8
2.target is not present.for eg . target=5 , target not present so we will return 4 as floor
 */
