package Day3;

import java.util.Scanner;

public class SumOfTwoNumbers {

    private static int sumOfTwoNumbers(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vaule for A : ");
        int A=sc.nextInt();
        System.out.println("Enter the value for B : ");
        int B=sc.nextInt();
        int sum= sumOfTwoNumbers(A,B);
        System.out.println("The sum of A and B "+sum);
    }

}
