package L2_Sortings;

public class A1_SelectionSort {
    public static void main(String args[]){

        int arr[]={30,60,10,22,20,14};
       int min=0;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] >arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Note:
In every Pass we bring smallest element ,and place its sorted position.
 //o/p- 10 14 20 22 30 60

 T.C
 best case - When arr is already Sorted. O(n2)
 Worst case-O(n2)

Use Case
1.use when size of array in small.
Selection sort is best used for small datasets, where memory is limited,
and simplicity is preferred. It's an in-place algorithm but inefficient for
larger datasets due to its O(n²) time complexity.

*/
