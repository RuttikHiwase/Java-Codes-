package Day2;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Maths Marks out of 100 : ");
        int Math=sc.nextInt();
        System.out.println("Enter the Science Marks out of 100: ");
        int Science=sc.nextInt();
        System.out.println("Enter the History Marksout of 100 : ");
        int History=sc.nextInt();

        double Average=(Math+Science+History)/3;
        String Grade="";
        if(Average >= 90)
        {
            Grade="Grade A";
        }
        else if(Average >= 70 && Average <= 89){
           Grade="Grade B";
        } else if (Average >= 50 && Average <= 69 ) {
            Grade="Grade C";
        } else if (Average >= 30 && Average <= 49) {
            Grade="Grade D";
        }else {
           Grade="Fail";
        }
        System.out.println("Average Marks are "+ Average);
        System.out.println("Grade "+ Grade);

    }
}
