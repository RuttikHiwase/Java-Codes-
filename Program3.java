//Enter 3 numbers from the user & make a function to print their average
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
       double avg= numAverage(a,b,c);
        System.out.println(avg);

//
    }
    public static double numAverage(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
}
