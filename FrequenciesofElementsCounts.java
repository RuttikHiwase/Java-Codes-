package Arrays;

public class FrequenciesofElementsCounts {
    public static void main(String[] args) {
        int arr[]={10,10,10,20,30,30,30,40};
        // 10 2
        //20  1
        //30  3
        //40  1

        int freq=1;
        int n=arr.length;
        int i=1;
       while(n>i)
       {
           while(n>i  && arr[i] ==arr[i-1])
           {
               freq++;
               i++;
           }
           System.out.println(arr[i-1] +"     "+ freq);
          i++;
          freq=1;

       }
       if(n == 1 || arr[n-1] !=arr[n-2])
           System.out.println(arr[n-1] + " "+ 1);
    }
}
