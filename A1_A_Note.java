package L3_BinarySearch;

public class A1_A_Note {
    public static void main(String[] args) {
        int arr[]={20,30,44,56,78,99,111};
        int start=0;
        int target=99;
        int end=arr.length-1;
        while(start <= end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]== target){
                System.out.print(mid);
                break;
            } else if (arr[mid] > target) {
                end=mid-1;
            }else{
                start=mid +1;
            }
        }
    }



}
// The question which uses word like Sorted - then try use binary search
// always try to apply concept of binary search
//"sorted" means you can reduce complexity more using binary search
//see question and look how to apply binary search
// dont usee int mid=(start+ end)/2; because int will overflow with big value
//Instead use start + (ens - start)/2;