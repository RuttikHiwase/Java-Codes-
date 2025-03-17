package GFG.Maths;

public class CountTheDigitsInNumber {
    public static void main(String[] args) {
        int num=876756;
        int res=0;
        while(num>0)
        {
            num=num/10;
            res++;
        }
        System.out.println(res);
    }
}
