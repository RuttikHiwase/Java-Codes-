package GFG.Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="hellolleh";
        int end=str.length()-1;
        int start=0;

        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end)) {
                System.out.println("String is Not Palindrome");
                break;
            }
            start++;
            end--;
        }

    }
}
