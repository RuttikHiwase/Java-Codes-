package GFG.Maths;

public class PalindromeNumberOrNot {
    public static void main(String[] args) {
        int num=63536;
        int temp=num;
        int rev=0,rem=0;
        while(temp>0)
        {
           rem= temp%10;
           rev=rev *10+rem;
           temp=temp/10;

        }
        if(rev==num)
        {
            System.out.println("It is Palindrome Number");
        }
        else {
            System.out.println("It is Not palindrome Numbers");
        }
    }
}
