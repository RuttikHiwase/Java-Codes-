public class Arraypractice5 {
    public static void main (String args[])
    {//Wap to swap first and last element from array.
        int a[]={12,13,14,15,161,71,34,25,26,72,91};
        //aab bab abb
       a[0]=a[0]+a[a.length-1];
        a[a.length-1]=a[0]-a[a.length-1];
        a[0]=a[0]-a[a.length-1];
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i] + " ");
        }


    }
}
