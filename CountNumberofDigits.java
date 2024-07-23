package Arrays;

public class CountNumberofDigits {
    public static void main(String[] args) {
        int a=76654;
        int res=0;

        while(a>0)
        {
            a=a/10;
            res++;
        }
        System.out.println(res);
    }
}
