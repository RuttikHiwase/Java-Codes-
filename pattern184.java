public class pattern184 {
    public static void main(String[] args) {
        /*
         *****
         *   *
         *   *
         *****
         */
        int n=5;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if( i==1 || i==4 || j==1 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
