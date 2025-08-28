public class Ques9_Check_If_Number_Is_Prime_Or_Not {
    public static void main(String[] args) {
        int num = 6 ;
         //check if num is greater than 2 or not
        int count=0;

        if(num < 2){
            System.out.println("Number is Not prime Number.");
            System.exit(0);
        }
        // checking the number of divisors b/w [1, n]
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
                count += 1;
        }

         if(count > 2){
             System.out.println("Number is Not Prime");
         }else{
             System.out.println("Number is Prime");
         }
    }
}
