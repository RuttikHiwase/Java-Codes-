import java.util.Scanner;
// Write a function that takes in age as input and returns if that person
// is eligible to vote or not. A person of age > 18 is eligible to vote.
public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String elg=checkElg(age);
        System.out.println(elg);

    }
    public static String checkElg(int age){
        String elg;
        if(age < 18)
            return elg="You are Not Eligible ";
        else
            return elg="You are Eligible";

    }
}
