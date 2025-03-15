package GFG.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        //Print Leaders in Array Reverse
        int arr[] = {10, 20, 100,0, 80,0, 60, 60, 70};
        int curr=arr[arr.length-1];
        System.out.print(curr+" ");

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i] > curr)
            {
                curr=arr[i];
                System.out.print(curr+ " ");
            }
        }
    }
}
