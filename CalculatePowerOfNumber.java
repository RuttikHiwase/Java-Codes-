package Arrays;

import java.util.Scanner;

public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        System.out.println("Enter the Power of Number : ");
        int x=sc.nextInt();

        int result=1;
        for(int i=1;i<=x;i++)
        {
            result=result*a ;
        }
        System.out.println(result);
    }
}
