public class pattern180 {
    public static void main(String[] args) {
        /*
        XOXOX
        O   O
        X   X
        O   O
        XOXOX
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++) {
                if(i==1||j==1||i==n||j==n)
                    if((i%2!=0&&j%2!=0)||(i%2==0&&j%2==0))
                    System.out.print("X");
                    else
                        System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
