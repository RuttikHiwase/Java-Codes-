package Day3;

import java.util.Scanner;

public class CalculateSum {
    private static int sumCalulation(int n){
        int sum=0;
        for(int i=n;i>0;i--){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        int res=sumCalulation(num);
        System.out.println(res);
    }
}
