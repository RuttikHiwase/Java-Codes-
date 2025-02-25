package Practice;

public class Practice1 {
     private static void swap(int arr[],int x,int y)
     {
         int temp=arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
     }
    public static void main(String[] args) {
        //Selection Sort
        int arr[]={29,39,59,2,99,45,32};
        int minval;

        for(int i=0;i<arr.length;i++)
        {
            minval=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minval])
                {
                    minval=j;
                }
            }
            swap(arr,minval,i);
        }
        for(int c: arr)
        {
            System.out.print(c + " ");
        }

    }
}
