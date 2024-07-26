import java.util.Scanner;

public class SB_StudentsGrade_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of English out of 20 :    ");
        int English=sc.nextInt();
        System.out.println("Enter the Marks of Maths out of 20 :    ");
        int Maths=sc.nextInt();
        System.out.println("Enter the Marks of Science out of 20 :    ");
        int Science=sc.nextInt();
        System.out.println("Enter the Marks of History out of 20 :    ");
        int History=sc.nextInt();
        System.out.println("Enter the Marks of Geography out of 20 :    ");
        int Geography=sc.nextInt();
        int Total=English+Geography+Maths+History+Science;
        System.out.println("Total Marks obtained by student  : " +  Total);
        if(Total > 90)
        {
            System.out.println("Excellent !");
        }
        else if (90 > Total && Total >=80 ) {
            System.out.println("Grade A !");
            
        }
        else if (80 > Total &&Total >= 70) {

            System.out.println("Grade B !");
        }
        else if (70 > Total && Total >= 60) {
            System.out.println("Grade C ! ");

        }
        else
            System.out.println("Grade F !");


    }
}
