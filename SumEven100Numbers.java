package Arrays;

public class SumEven100Numbers {
    //Java Program to Print Sum of Even Numbers between 1 to 100
    public static void main(String[] args) {
        int n=100;
        int sum=0;
        for(int i=1; i<=n;i++){
            if(i % 2 == 0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
