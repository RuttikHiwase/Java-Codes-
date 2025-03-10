package L3_BinarySearch;

public class A9_Next_Alphabatical_Element {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'j';

        int start = 0, end = letters.length - 1;
        char res = letters[0];  // Default to the first letter if no greater letter is found

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                res = letters[mid];  // Potential next greatest letter
                end = mid - 1;  // Move left to check for smaller letters
            } else {
                start = mid + 1;  // Move right to find a greater letter
            }
        }

        System.out.println("Next greatest letter after " + target + " is: " + res);
    }
}
/*
Note:
1.Refer the approch used in Ceil of Element Problem
2.Have some code variation in that problem
3. In this problem we have been given the alphabets arr =[ e,t,y,g,d,f]
4.and key will be given key=t,we need to find the alphabet next to t. i.e->y
5.so our output will be y.always return next alpha to key element.

 */