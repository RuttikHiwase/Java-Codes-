package Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x=123321;
        int temp=x;
        int rem = 0;
        int sum=0;
        while(temp !=0) {
            rem = temp% 10;
            sum=(10*sum)+rem;
            temp = temp / 10;
        }
        if(sum==x){
            System.out.println("The Numbers are Palindrome");
        }
        else{
            System.out.println("Numbers are Not Palindrome");
        }
    }
}
