package GFG.Hashing;

public class LongestSubArraysWithEqualNumbersOFZerosAndOnes {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,1,0};//O/P- 4
        //Naive Method -Problem for Problem Statement go through Video
        int res=0,diffcounter=0;
        for(int i=0;i<arr.length;i++)
        {
            int c0=0,c1=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]  == 0)
                    c0++;
                else
                     c1++;

                diffcounter=c1-c0;
                if(diffcounter == 0)
                 res++;
            }
        }
        System.out.println(res);
//------------------------------------------------------------------------------
    }
}
