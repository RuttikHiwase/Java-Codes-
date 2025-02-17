package GFG.Strings;

public class LeftMostRepeatingCharacter {
    //LeftMost Reapeating Chracter - refer GFG to understand the Question
    //Naive Method -O(n*n)
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------
        //Naive Method
        String str1="Ruttik";
        for(int i=0;i<str1.length();i++)
        {
            for(int j=i+1;j<str1.length();j++)
            {
                if(str1.charAt(i) == str1.charAt(j))
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        //-----------------------------------------------------------------------------------------
        //Better Approch
       String str2="Ruttaj";
        int CHAR=256;
        int count[]=new int[CHAR];
        for(int i=0;i<str2.length();i++)
        {
            count[str2.charAt(i)]++;
        }
        for(int j=0;j<CHAR;j++)
        {
            if(count[str2.charAt(j)] > 1)
            {
                System.out.println(j);
                break;
            }
        }
    }
}
