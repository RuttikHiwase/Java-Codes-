package Practice;

public class Practice2 {
    public static void main(String[] args) {
        int arr[]={1,43,23,65,7,31,34};
        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j< arr.length-i;j++)
            {
                if(arr[j-1] > arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int c:arr)
        {
            System.out.print(c + " ");
        }
    }
}
