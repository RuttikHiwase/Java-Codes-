public class Ques8_Check_Year_Is_Leap_Year_Or_Not {
    public static void main(String[] args) {
        int year = 2004;
        if(year % 400 == 0)
        {
            System.out.println("It is a leap year.");
        }else if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("It is a leap year ");
        }else{
            System.out.println("It is not leap year.");
        }
    }
}
