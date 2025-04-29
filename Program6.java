import java.util.Scanner;
//Write a function that takes in the radius as input and returns the circumference of a circle.
// c=2pie r
public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double ans=circum(r);
        System.out.println(ans);

    }
    public static double circum(int r){
        double ans= 2 * 3.14 * r;
        return ans;
    }
}
