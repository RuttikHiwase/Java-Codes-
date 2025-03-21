package Recursion_And_Backtracking;
/*
Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.
Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
public class Prblm1_Reverse_String_Using_Recursion {
//    // Solution-1 Iterative
//    class Solution {
//        public void reverseString(char[] s) {
//            int n = s.length;
//            for(int i = 0; i < n / 2; i++) {
//                char temp = s[i];
//                s[i] = s[n - 1 - i];
//                s[n - i - 1] = temp;
//            }
//        }
//    }

//    // Solution-2 Recursive
//    class Solution {
//        public void reverseString(char[] s) {
//            helper(s, 0, s.length - 1);
//        }
//
//        private void helper(char[] s, int left, int right) {
//            if (left >= right) return;
//            char tmp = s[left];
//            s[left++] = s[right];
//            s[right--] = tmp;
//            helper(s, left, right);
//        }
//    }
}
//TC-O(N)
//SC-O(N)
//leetcode link -https://leetcode.com/problems/reverse-string
//youtube referencce-https://www.youtube.com/watch?v=97SfamKPCuo
//
