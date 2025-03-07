package L2_Sortings;
public class A2_Bubble_Sort {
   public static void main(String args[]){
       int arr[]={30,60,10,22,20,14};

       for(int i=1;i<arr.length;i++){
         // 1 to n-1
           for(int j=0;j<arr.length-1;j++){
               if(arr[j] > arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i] + " ");
       }
   }

}
//Note:
//In every Pass Largest element will be placed  at correct position

//T.C
// O(n2)
//Best Case - already sorted
//worst Case - reversed sorted

//S.C-O(1)

//Use Case
//Bubble sort is best for small or nearly sorted datasets where simplicity is
// prioritized over performance. It's inefficient for large datasets and should
// be avoided in performance-critical applications.



