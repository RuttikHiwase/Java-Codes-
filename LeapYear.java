package Day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*
        Problem Statement:
Write a Java program that checks whether the year is a leap year or not. A year is a leap year if:
It is divisible by 4, but not divisible by 100, or
It is divisible by 400.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        if(year % 4 == 0 && year % 100 !=0)
        {
            System.out.println(year +" is leap year");
        }
        else if(year % 400 == 0)
        {
            System.out.println(year +" year is Leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }
}
