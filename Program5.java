//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class Program5 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int ans=greatNum(a,b);
        System.out.println("The Greater Number is :  "+ ans);


    }
    public static int greatNum(int a,int b){
        if(a>b)
            return a;
        else
            return b;


    }
}
