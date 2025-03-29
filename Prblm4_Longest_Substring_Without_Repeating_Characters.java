package L6_Sliding_Window_And_Two_Pointer;

import java.util.ArrayList;

public class Prblm4_Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        /*
            // BruteForce Approach:
            int max = 0;
            int[] cnt = new int[128];
            for(int i = 0; i < s.length(); i++){
                int distCount = 0;
                Arrays.fill(cnt, 0);
                for(int j = i; j < s.length(); j++){
                    if(cnt[s.charAt(j)] == 0){
                        distCount++;
                    }
                    else{
                        break;
                    }
                    cnt[s.charAt(j)]++;
                    max = Math.max(max, distCount);
                }
            }
            return max;
        */

        // Solution: 02 -> Time Complexity: O(2N) & Space Complexity: O(N).
        ArrayList<Character> list = new ArrayList<>();
        int r = 0, max = 0;
        while(r < s.length()){
            if(list.contains(s.charAt(r))){
                while(list.contains(s.charAt(r))){
                    list.remove(0);
                }
            }
            list.add(s.charAt(r));
            r++;
            max = Math.max(max, list.size());
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
