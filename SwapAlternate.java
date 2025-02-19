package GFG.Strings.Extra;

public class SwapAlternate {
    public static void main(String[] args) {
        String str="abcdef";
        // o/p - badcfe

    char arr[]=str.toCharArray();
     char temp=0;
     for(int i=0;i<arr.length;i=i+2)
     {
         temp=arr[i];
         arr[i]=arr[i+1];
         arr[i+1]= temp;
     }
     for(char c: arr)
     {
         System.out.print(c);
     }
    }
}
