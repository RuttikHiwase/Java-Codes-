package GFG.Hashing;
import java.util.Arrays;
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {// O(n log n)
        int arr[]={23,34,35,45,46,47,48,8,9,10,11,12,6};
        int res=1,curr=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i+1] == arr[i-1]+1)
                curr++;

            else if(arr[i+1] != arr[i-1])
            {
                res=Math.max(res,curr);
                curr=1;
            }

        }
        System.out.println(res);
    }
}
