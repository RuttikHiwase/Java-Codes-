package L6_Sliding_Window_And_Two_Pointer;

public class Prblm8_Maximum_Points_You_Can_Obtain_from_Cards {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += cardPoints[i];
        }
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        int tempsum = 0;
        while(j < (n - k)){
            tempsum += cardPoints[j];
            j++;
        }
        max = Math.max(max, sum - tempsum);
        while(j < n){
            tempsum += cardPoints[j];
            tempsum -= cardPoints[i++];
            max = Math.max(max, sum - tempsum);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {100,40,17,9,73,75};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
}
/*
Optimized Approach
class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int lsum =0, rsum =0, max =0,sum =0;
        int n = cardPoints.length;
        for(int i=0;i<k;i++){
            lsum = lsum + cardPoints[i];
        }
        max = lsum;
        for (int i = 0; i < k; i++) {
            lsum -= cardPoints[k-1-i];
            rsum += cardPoints[cardPoints.length -1-i];
            sum = lsum+rsum;
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
 */