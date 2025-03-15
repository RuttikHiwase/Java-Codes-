package GFG.Arrays;

public class MajorityElement {
    //Majority Element - The element is appeared more than arr.length/2 times
    // print the index of that element
    // This is a Naive solution
    //This can be solved efficient using mooreys Voting Algorithm


    public static void main(String[] args) {
        int arr[]={20,20,30,40,10,10,20,20,20,20};
        int n=arr.length;
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > n/2) {
                System.out.print(i + " ");
            }
        }
    }
}
