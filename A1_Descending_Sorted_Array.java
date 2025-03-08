package L3_BinarySearch;

public class A1_Descending_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={100,98,54,45,23,21,17};
        int key=17;
        int start=0, end=arr.length-1;
        while(start <= end)
        {
            int mid=start + (end-start)/2;
            if(arr[mid] == key)
            {
                System.out.print(mid);
                break;
            } else if (arr[mid] > key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}
