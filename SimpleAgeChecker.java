package Day3;

import java.util.Scanner;

public class SimpleAgeChecker {
    public static String  checkAgeCategory(int age){
        String ageCategory="";
        if(age < 18)
        {
            ageCategory="The Person is minor";
        }else if(age > 18 &&  age <50 ){
            ageCategory="The Person is Adult";
        }else{
            ageCategory="Person is Senior Citizen";
        }
        return ageCategory;
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Person : ");
        int age=sc.nextInt();
        String message= checkAgeCategory(age);
        System.out.println(message);
    }
}
