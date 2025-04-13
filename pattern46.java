public class pattern46 {
    public static void main(String[] args) {
        /*1
          3   2
          6   5    4
          10  9    8    7
          15  14   13   12    11
         */
        int n=5;
        int count=1;
        for(int i=1;i<=5;i++)
        {    int c=count;
            for(int j=i;j>=1;j--)
            {
                System.out.print(c+"\t");
                c--;
            }count+=i+1;
            System.out.println();
        }
   }
}