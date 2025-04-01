package L6_Sliding_Window_And_Two_Pointer;

public class Note {
}
/*
Sliding wimdow problems indentification
* In Question they will ask to find subsequence or substring
Or
if they are asking for largest mininum like questions
---------------------------------------------------------
Sliding Window has two types of problems
1.Fixed sized Window
2.Variable Sized Window
----------------------------------------------------------
How to apply the sliding window
1. we will denote start of window as i, and end as j
2. so if  arr is arr= 2 3 5 6 7 8  ,i=1 idx , j= 4idx
3. To find the length of window we can use formula j-i+ 1.
4.i.e - 4- 1 + 1  = 4 . so ans= 4 is the length of window

Application - find max sum sub array with K window Size
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
