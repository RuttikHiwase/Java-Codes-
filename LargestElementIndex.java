package GFG.Arrays;
//Largest Element Inside the Array
public class LargestElementIndex {
    public static void main(String[] args) {
        int arr[]={11,22,353,44,55};
        int res=0;
        for(int i=1;i<arr.length;i++)
        {

            if(arr[res] < arr[i])
                  res=i;
        }
        System.out.println(res);
    }
}
