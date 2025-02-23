package GFG.Hashing;
//SubArray Must be the Consecutive
public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={10,2,3,5,4};
        int sum=10;
        int res=0;
        //Naive Solution Using two for Loops

        for(int i=0;i< arr.length;i++)
        {
            int curr_sum =0;
            for(int j=i;j< arr.length;j++)
            {
                curr_sum =curr_sum + arr[j];
                if(curr_sum == sum)
                {
                  res=Math.max(res,j-i+1);
                }
            }
        }
        System.out.println(res);
    }
}
