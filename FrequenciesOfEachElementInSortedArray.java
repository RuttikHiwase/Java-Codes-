package GFG.Arrays;

public class FrequenciesOfEachElementInSortedArray {
    public static void main(String[] args) {
        int arr[]={11,11,22,33,33,33,33,44,53,53,53};
        int freq=1;
        int n=arr.length;
        int i=1;
        while(n>i) {
            while (n > i && arr[i] == arr[i - 1]) {
                freq++;
                i++;

            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1] != arr[n-2])
        {
            System.out.println(arr[n-1]+" "+1);
        }
    }
}
//for unsorted arrays -first Sort by Arrays.sort