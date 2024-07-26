public class SB_Fibonacci_3 {
    public static void Fibonacci(int n){
        int num1=0;int num2=1;
        int counter = 0;
        while(counter <  n)
        {
            System.out.println(num1 + " ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            counter= counter +1;
        }
        int num3=num2+num1;
        num1=num2;
        num2=num3;
        counter= counter +1;
    }



    public static void main(String[] args) {
        int n=10;
        Fibonacci(n);
    }
}
