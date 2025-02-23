package GFG.Hashing;

public class MoreThanNDividedKOccurence {
    public static void main(String[] args) {
        int arr[]={10,10,20,20,20,20,30,30,30,30,30,40,60};
        int k=4;
        int n=arr.length;
   //Apply Arrays.Sort If Array is Not Sorted
        int i=1,count=1;
        while(i<n)
        {
            while(i< n && arr[i] == arr[i-1])
            {
                count++;
                i++;
            }
            if(count > n/k) {
                System.out.print(arr[i - 1] + " ");
            }
                count = 1;
                i++;

        }
    }
}
