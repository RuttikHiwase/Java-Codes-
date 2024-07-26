import java.util.Scanner;

public class SB_Factorial_2 {


    public static int calFactorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n :   ");
        int n=sc.nextInt();
       int fact =calFactorial(n);
        System.out.println(fact);
    }
}
