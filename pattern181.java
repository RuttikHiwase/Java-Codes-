public class pattern181 {
    public static void main(String[] args) {
        /*
                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *
         */
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n;j++)
                System.out.print(" ");
            for(int j=1;j<=(i*2)-1;j++)
                if(j==1||j==(i*2)-1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();


        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<i;j++)
                System.out.print(" ");
            for(int j=1;j<=((n-i+1)*2)-1;j++)
                if(j==1||j==((n-i+1)*2)-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
