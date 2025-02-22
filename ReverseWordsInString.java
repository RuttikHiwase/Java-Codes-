package GFG.Strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str="Geeks for Coders";
        char strsrr[]=str.toCharArray();
        

    }
    void reverse(char strarr[], int high ,int low)
    {
        while(low < high) {
            char temp = strarr[high];
            strarr[high] = strarr[low];
            strarr[low] = temp;
            low++;
            high--;
        }
    }
}
