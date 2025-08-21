package Day3;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Grade Evaluation System : 1");
            System.out.println("Leap Year Check  : 2");
            System.out.println("Day of the week : 3");
            System.out.println("Identify Default Values of Variables : 4");
            System.out.println("Exit  : 5");
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Grade Evaluation System Program");
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
                    break;

                case 2:
                    System.out.println("Leap Year Check Program");
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
                    break;

                case 3 :
                    System.out.println("Day of the week Program");
                    System.out.println("Enter the Number : ");
                    int day=sc.nextInt();
                    switch(day)
                    {
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                            break;
                        case 7:
                            System.out.println("Saturday");
                            break;
                        default:
                            System.out.println("Invalid No.");

                    }
                    break;
                case 4:
                    System.out.println("Identify Default Values of Variables program");
                    byte a=0;
                    short b=0;
                    int c=0;
                    long d=0;
                    float e=0;
                    double f=0.0;
                    char g='a';
                    boolean h=false;
                    System.out.println("The value of a : "+ a);
                    System.out.println("The value of b : "+ b);
                    System.out.println("The value of c : "+ c);
                    System.out.println("The value of d : "+ d);
                    System.out.println("The value of e : "+ e);
                    System.out.println("The value of f : "+ f);
                    System.out.println("The value of g : "+ h);
                    break;
                case 5 :
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Enter values Between 1 to 5...");
                    break;
            }
        }while(choice != 5);
        System.out.println("Program Executed Successfully !!!!!!!!!!!!");
    }
}
