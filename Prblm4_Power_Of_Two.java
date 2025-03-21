package Recursion_And_Backtracking;

public class Prblm4_Power_Of_Two {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            if (n == 1) return true;
            return (n % 2 == 0) && isPowerOfTwo(n / 2);
        }
    }
}
/*
Approach 8(Recursion)
Recursively divide n by 2, if we reach 1 then it means it is multiple of 2 and will return true else it will be false.
Complexity.

Time complexity:
O(logn)

Space complexity:
O(logn)

leetcode -https://leetcode.com/problems/power-of-two/submissions/1580297443/
 */