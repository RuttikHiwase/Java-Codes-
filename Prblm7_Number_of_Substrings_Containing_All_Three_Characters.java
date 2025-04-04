package L6_Sliding_Window_And_Two_Pointer;

public class Prblm7_Number_of_Substrings_Containing_All_Three_Characters {
    public static int numberOfSubstrings(String s) {
        /*
           // BruteForce Approach: We will to generate all the possible subStirng and among then we will check, How many are the Substring which contains 'a' & 'b' & 'c' and we will return the count of the Substring.

           // Time Complexity: O(N^2) & Space Complexity: O(N);

           String str;
           int count = 0;
           for(int i = 0; i < s.length(); i++){
               str = "";
               for(int j = i; j < s.length(); j++){
                   str += s.charAt(j);
                   if(str.contains("a") && str.contains("b") && str.contains("c")){
                       count++;
                   }
               }
           }
           return count;
        */

        /*
            // Solution 2:
            int count[] = {0, 0, 0}, res = 0 , i = 0, n = s.length();
            for (int j = 0; j < n; j++) {
                count[s.charAt(j) - 'a']++;
                while (count[0] > 0 && count[1] > 0 && count[2] > 0){
                    count[s.charAt(i++) - 'a']--;
                }
                res += i;
            }
            return res;
        */

        // Optimized Approach: Using Sliding Window *Explanation(https://www.youtube.com/watch?v=VNL2VhDxj7U)
        int count = 0;
        int idx_a = -1, idx_b = -1, idx_c = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                idx_a = i;
            }
            else if(s.charAt(i) == 'b'){
                idx_b = i;
            }
            else{
                idx_c = i;
            }
            if(i > 1){
                int min = Math.min(idx_a, idx_b);
                min = Math.min(min, idx_c);
                count += min + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
/*
Optimized - O(N)
public int numberOfSubstrings(String s) {
        char[] ch = s.toCharArray();
        int[] abc = new int[3];
        for(int i = 0; i < abc.length; i++){
            abc[i] = -1;
        }
        int count = 0, right = 0;
        while(right < ch.length){
            abc[ch[right] - 'a'] = right;
            int minIndex = Integer.MAX_VALUE;
            for(int i = 0; i < 3; i++){
                minIndex = Math.min(minIndex, abc[i]);
            }
            count += (minIndex + 1);
            right++;
        }
        return count;
    }
 */
