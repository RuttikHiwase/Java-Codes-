package L5_Strings;

public class Prblm5_RemoveOuterParentheses {
    public static String removeOuterParentheses(String str) {
        /*
           Time complexity: O(N^2) & Space complexity: O(1).
           N^2 due to every time creating a new string object

           String ans = "";
           int j = 0;
           for(int i = 0; i < str.length() - 1; i++){
               if(str.charAt(i) == ')'){
                   j--;
               }
               if(j != 0){
                   ans += str.charAt(i);
               }
               if(str.charAt(i) == '('){
                   j++;
               }
           }
           return ans;
        */

        // Time complexity: O(N) & Space complexity: O(1).

        StringBuilder ans = new StringBuilder();
        int j = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == ')'){
                j--;
            }
            if(j != 0){
                ans.append(str.charAt(i));
            }
            if(str.charAt(i) == '('){
                j++;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }
}
