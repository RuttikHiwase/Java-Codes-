package Arrays;

public class SumofDigits {
    public static void main(String[] args) {
        int num=12342;
        int sum=0;
        int rev=0;
        while(num != 0){
            rev=num%10;
            sum+=rev;
            num=num/10;
        }
        System.out.println(sum);
    }
}
