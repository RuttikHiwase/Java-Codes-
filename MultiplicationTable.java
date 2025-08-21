package Day3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        printMultiplicationTable(num);
    }

    private static void printMultiplicationTable(int num) {
        for(int i=1;i<=10;i++)
        {
            System.out.println( num +" x "+ i + " = "+ num * i);
        }
    }
}
