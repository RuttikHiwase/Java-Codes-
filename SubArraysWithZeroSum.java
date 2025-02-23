package GFG.Hashing;

import java.util.HashSet;

public class SubArraysWithZeroSum {
    public static void main(String[] args) {
        //Naive Solution
        int arr[]={4,-3,2,1};
        for(int i=0;i<arr.length;i++)
        {
            int curr_sum=0;
            for(int j=i;j<arr.length;j++)
            {
                curr_sum = curr_sum + arr[j];

            }
            if(curr_sum == 0) {
                System.out.println("Zero");
                break;//return true}
            }
        }
        //return false;

        //-------------------------------------------------------------------------------------------
        //Efficient Solution using the Hashset
        //O(n)
        int arr1[]={4,-3,2,1};
        HashSet<Integer> hs=new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            pre_sum=pre_sum + arr[i];
            if(hs.contains(pre_sum)) {
                System.out.println("Zero in condition one");
                break;
            }
            if(pre_sum == 0) {
                System.out.println("Zero in condition second");
                break;
            }

            hs.add(pre_sum);
        }
     }
}
