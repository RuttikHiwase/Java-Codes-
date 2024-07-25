package Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int  fnum=0,snum=1,nextnum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print(fnum + " ");
            nextnum=snum+fnum;
            fnum=snum;
            snum=nextnum;
        }
    }
}
