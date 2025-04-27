import java.util.Scanner;
public class Program8 {
    public static void main(String[] args) {
        //Write a program to print Fibonacci series of n terms where n is input by user :
        //0 1 1 2 3 5 8 13 21 .....
        int temp;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            temp = i ;
            System.out.println(temp);

        }

    }
}
