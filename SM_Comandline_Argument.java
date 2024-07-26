import java.util.Scanner;

public class SM_Comandline_Argument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of of arguments to be inputed : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Command line Arguments are :   ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
