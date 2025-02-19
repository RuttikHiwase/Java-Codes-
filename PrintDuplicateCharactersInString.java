package GFG.Strings.Extra;

import java.util.HashMap;
import java.util.Map;
//How to print the duplicate characters from the given String?

public class PrintDuplicateCharactersInString {
    public static void main(String[] args) {
        String str="hello to wolrd of Strings";

        HashMap<Character,Integer> charfreq=new HashMap<>();
        for(char c:str.toCharArray())
        {
            if(c ==' ')
                continue;

            if(charfreq.containsKey(c))
            {
                charfreq.put(c, charfreq.get(c)+1);
            }
            else{
                charfreq.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: charfreq.entrySet())
        {
            if(entry.getValue()>1)
            {
               // System.out.println(entry.getKey()+" "+entry.getValue());
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
