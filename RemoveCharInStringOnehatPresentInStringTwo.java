package GFG.Strings.Extra;

import java.util.HashSet;
//How to remove characters from the first String which are present in the second String

public class RemoveCharInStringOnehatPresentInStringTwo {
    public static void main(String[] args) {
        String str1="hello to coding world";
        String str2="tngo";

        HashSet<Character> charset=new HashSet<>();
        for(char c:str2.toCharArray())
        {
            charset.add(c);
        }
        StringBuilder result=new StringBuilder();
        for(char x:str1.toCharArray())
        {
            if(x ==' ')
                continue;
            if(!charset.contains(x))
            {
                result.append(x);
            }
        }
        System.out.println(result.toString());

    }
}
