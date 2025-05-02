//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double ans=oddSum(n);
        System.out.println(ans);
    }
    public static double oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                 sum = sum + i;
            }
        }
        return sum;


    }
}
