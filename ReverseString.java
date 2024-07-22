package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        int end=str.length()-1;
        int start=0;
        char chararr[]=str.toCharArray();
        char temp;
        while(start < end)
        {
            temp=chararr[start];
            chararr[start]=chararr[end];
            chararr[end]=temp;


            start++;
            end--;

        }
        String revstring=new String(chararr);
        System.out.println(revstring);
    }
}
