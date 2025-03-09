package L3_BinarySearch;

public class A6_Search_Element_In_Nearly_Sorted_Array {
    public static void main(String[] args) {
        int[] a = {5, 10, 30, 20, 40};
        int k = 40;
        int n = a.length;

        int start = 0;
        int end = n - 1;

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k == a[mid]) {
                result = mid;
                break;
            }

            if (mid - 1 >= start && k == a[mid - 1]) {
                result = mid - 1;
                break;
            }

            if (mid + 1 <= end && k == a[mid + 1]) {
                result = mid + 1;
                break;
            }

            if (k < a[mid - 1]) {
                end = mid - 2;
            } else if (k > a[mid + 1]) {
                start = mid + 2;
            }
        }

        System.out.println(result);
    }
}
/*
Note:
Nearly sorted array means , if regular index of element is i,
then in nearly sorted array it will be ith -1 or ith + 1
1.Here we need to use modified binary search approch
2. this approch says  that compare with mid as well mid-1 and mid +1.
 */
