package GFG.Maths;

public class TrailingZeroInEndOfFactorial {
    public static void main(String[] args) {
        int n=10;
        int res=1;
        int count=0;
        for(int i=2;i<=n;i++)
        {
            res=res*i;
        }
        int temp=res;

        while(temp>0)
        {
            if(temp%10 ==0)
                count++;
            temp=temp/10;
        }
        System.out.println(count);
    }
}
