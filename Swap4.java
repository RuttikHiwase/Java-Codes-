public class Swap4 {

    public static void swapVar(int m,int n){
        int temp=m;
        m=n;
        n=temp;
        System.out.println("value of m" + m);
        System.out.println("value of n" + n);

    }

    public static void main(String[] args) {
        int m=5;
        int n=15;
        System.out.println("m = 5 \n n=15");
         swapVar(m,n);


    }
}
