import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any Message :      ");
        String str=sc.nextLine();
        System.out.println("The Message entered was : " + str);
        String firstName=sc.next();
        String lastName=sc.next();
        String fullName= firstName + "+" + lastName ;
        System.out.println(fullName);


    }
}
