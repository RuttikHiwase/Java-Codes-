import java.util.Scanner;

public class Ques2_Num_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even ");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
