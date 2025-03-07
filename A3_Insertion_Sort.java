package L2_Sortings;

public class A3_Insertion_Sort {
    public static void main(String[] args) {

        int arr[]={10,30,50,33,99,11};
        for(int i=1;i<arr.length;i++)
        {   int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--)
            {
                if(arr[j] > temp)
                {
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}

//Note
// Insertion sort dont use swapping concept,rahter it uses shiftin Elements
//why to use?
//1.Its very adaptable algorithm
//2.Its stable
//3.Good Performance on small siz array or partially sorted array.

//T.C - best case -O(n)
//      worst case -O(n2)
//S.C - O(1) constant
