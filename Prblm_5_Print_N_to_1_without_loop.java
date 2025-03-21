package Recursion_And_Backtracking;

public class Prblm_5_Print_N_to_1_without_loop {
    class Solution {

        void printNos(int N) {
            // code here

            if(N > 0)
            {
                System.out.print(N + " ");
                printNos(N-1);
                //System.out.print(N + " ");
            }
        }
    }
}
/*
GeeksForGeeks -http://geeksforgeeks.org/problems/print-n-to-1-without-loop/1
 */