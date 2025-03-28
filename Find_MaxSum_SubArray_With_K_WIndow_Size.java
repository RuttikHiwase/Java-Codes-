package L6_Sliding_Window_And_Two_Pointer.Aditya_Verma;

public class Find_MaxSum_SubArray_With_K_WIndow_Size {
    public static int findMaxSumSubArrayUsingWhile(int k, int[] arr) {
        int maxSum = 0, windowStart = 0, windowEnd = 0, windowSum = 0;

        while(windowEnd < arr.length) {
            windowSum += arr[windowEnd];
            if (windowEnd - windowStart + 1 >= k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
            windowEnd++;
        }
        return maxSum;

        /* Using For Loop
        public static int findMaxSumSubArrayUsing For(int k, int[] arr) {
    int maxSum = 0, windowSum = 0;
    int windowStart = 0;

    for (int windowEnd=0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd];
      if(windowEnd >= k-1) {
        maxSum = Math.max(maxSum, windowSum);
        windowSum -= arr[windowStart];
        windowStart++;
      }
    }
    return maxSum;
  }
         */
    }






    public static void main(String[] args) {
        // Example input array
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        // Call the method to find the maximum sum of subarray of size k
        int maxSum = findMaxSumSubArrayUsingWhile(k, arr);

        // Output the result
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}
/* For Understanding Algo
long sum = 0;
   long max = Integer.MIN_VALUE;
   int i = 0;
   int j = 0;
   while(j<N){
       while((j-i+1)<=K){
            sum += Arr.get(j);
           j++;
       }
       max = Math.max(max,sum);
       sum -= Arr.get(i);
       i++;
   }
return max;
}
 */
