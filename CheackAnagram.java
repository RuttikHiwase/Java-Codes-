package GFG.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheackAnagram {
    //Note: Anagram means- In Str1 ans Str2 Ocurencces of alphbets must be same
    //Two Methods for Anagram - Naive and Efficient
    //Naive-Time Complexity - o(n log n)
    //Efficient-
    public static void main(String[] args) {

//        String str1="helrlodev";
//        String str2="devhello";
//        char arr1[]=str1.toCharArray();
//        char arr2[]=str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//         str1=new String(arr1);
//         str2=new String(arr2);
//
//         if(str1.equals(str2))
//         {
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//-------------------------------------------------------------------------------------------------------
        //Efficient
        String str1="hellodev";
        String str2="devhgello";
        int CHAR=256;
        int count[]=new int[CHAR];
        if(str1.length() != str2.length())
            System.out.println("False");

        for(int i=0;i<str1.length();i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++)
        {
            if(count[i] != 0)
            {
                System.out.println("Not An Anagram");
                break;
            }

        }
    }

}
