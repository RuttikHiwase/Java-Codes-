package GFG.Maths;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n=8;
        int res=1;
        for(int i=2;i<=n;i++)
        {
            res=res*i;
        }
        System.out.println(res);
    }
}
