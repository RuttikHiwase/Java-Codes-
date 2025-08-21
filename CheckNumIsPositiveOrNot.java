package Day3;

import java.util.Scanner;

public class CheckNumIsPositiveOrNot {
    private static void askForPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        }while(number <= 0);
        System.out.println("You entered a positive number: " +number);
        sc.close();
    }

    public static void main(String[] args) {
        askForPositiveNumber();


    }
}
