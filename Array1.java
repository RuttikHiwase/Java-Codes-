//Swap first and last element of Array.
class Array1
{
   public static void main (String args[])
   {
    int a[]={5,4,8,9,97,4};
    int temp=0;
    temp=a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
    for(int i=1;i<a.length;i++)
    
    System.out.println(a[i]);
    }
}