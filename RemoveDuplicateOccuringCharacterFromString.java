package GFG.Strings.Extra;

import java.util.HashSet;
//How to remove all duplicates from a given string?

public class RemoveDuplicateOccuringCharacterFromString {
    public static void main(String[] args) {
        String str="i am doing coding on ideapad";
        HashSet<Character> charset=new HashSet<>();
        for(char c:str.toCharArray())
        {
            if(c == ' ')
                continue;

            charset.add(c);
        }
       for(char c:charset)
       {
           System.out.print(c);
       }
    }
}
