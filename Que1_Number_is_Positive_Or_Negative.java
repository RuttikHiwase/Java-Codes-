import java.util.Scanner;

public class Que1_Number_is_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the Number ; ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
    }

}
