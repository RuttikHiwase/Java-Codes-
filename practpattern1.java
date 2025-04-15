class practpattern1{
    public static void main(String[] args) {
         int n=5;
         int s=1;
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j<n;j++)
             {
                 System.out.print(" ");
             }
             for(int j=i;j>=1;j--)
             {
                 System.out.print((char)(s+64));
                 s++;
             }
             System.out.println();
         }


    }
}
