package GFG.Strings.Extra;

public class InsertStringInsideString {
    public static void main(String[] args) {
        String str1="GeeksGeeks";
        String str2="for";
        int index=4;
        char arr[]=str1.toCharArray();
        String nw=new String();
        for(int i=0;i<str1.length();i++)
        {
            nw+=str1.charAt(i);

            if(index==i)
            {
                nw+=str2;
            }
        }
        System.out.println(nw.toString());
    }
}
