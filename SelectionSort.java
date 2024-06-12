public class SelectionSort {
    public static void main(String[] args) {
        int []arr={23,45,56,67,87,88,8879,234,553,22,1,4534,34,55555,3,4,5,3,65,54,439,99};
        int temp;
        for(int i=0;i< arr.length-1;i++)
        {
         for (int j=1+i;j< arr.length-1;j++)
         {
             if(arr[i] > arr[j])
             {
                   temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
             }
         }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
