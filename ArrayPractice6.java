public class ArrayPractice6 {
    public static void main(String args[])
    {//Wap to Shift First Element to the last.
        int a[]={12,31,13,14,43,87,86,45,34,43,25,145};
        int temp=0;
        temp=a[0];

        for(int i=1;i<=a.length-2;i++) {
            a[i - 1] = a[i];
            a[a.length - 1] = temp;



        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
