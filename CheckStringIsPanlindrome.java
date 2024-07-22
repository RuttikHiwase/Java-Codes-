package Strings;

public class CheckStringIsPanlindrome {
    public static void main(String[] args) {
  String str="Madam";
      // char a[]=str.toCharArray();
      // int len=a.length;
       int begin=0;
       int end=str.length()-1;
       while(begin<end)
       {
           if(str.charAt(begin) != str.charAt(end)) {
               System.out.println("false");
           }

           begin++;
           end--;
       }

    }
}
