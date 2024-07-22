package Strings;

public class SubsequenseofEachOther {
    public static void main(String[] args) {
        String str1="ABCDEF";
        String str2="ACER";
        int len1=str1.length();
        int len2=str2.length();
        int j=0;
        for(int i=0;i<len1 && j<len2 ;i++)
        {
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
        }
        System.out.println(j==len2);


    }
}
