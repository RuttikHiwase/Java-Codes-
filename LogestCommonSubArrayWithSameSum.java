package GFG.Hashing;

public class LogestCommonSubArrayWithSameSum {
    public static void main(String[] args) {
        int arr1[]={0,1,0,0,0,0};
        int arr2[]={1,0,1,0,0,1};
        int res=0;
        for(int i=0;i< arr1.length;i++)
        {
            int sum1=0,sum2=0;
            for(int j=i;j<arr1.length;j++)
            {
                sum1=sum1+arr1[j];
                sum2=sum2+arr2[j];

                if(sum1 == sum2)
                {
                    res=Math.max(res,j-i+1);
                }
            }
        }
        System.out.println(res);
    }
}
