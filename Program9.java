import java.util.Scanner;
//To check element present on which index inside array.
public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :  ");
        int size=sc.nextInt();
        System.out.println("Enter the Numbersto Array :  ");
        int Numbers[]=new int[size];
        for (int i=0;i<size;i++)
        {
            Numbers[i]=sc.nextInt();
        }
        System.out.println("The Elements inside Array are :  ");
        for(int i=0;i<size;i++)
        {
            System.out.print(Numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the Number to check inside the Array :  ");
        int num=sc.nextInt();
        for (int i=0;i<size;i++)
        {
           if(Numbers[i] == num ) {
               System.out.println("Element found at index :  " + i);
           }

        }
    }
}
