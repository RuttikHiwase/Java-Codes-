package GFG.Strings.Extra;

import java.util.HashMap;
import java.util.Map;
//How to find the maximum occurring character in a given String?

public class MaximumOccuringCharacterInString {
    public static void main(String[] args) {
        String str="hello this programming tutorial with practice ";
        HashMap<Character,Integer> charfreq=new HashMap<>();

        for(char c: str.toCharArray())
        {
            if(c == ' ')
                continue;

            if(charfreq.containsKey(c))
            {
                charfreq.put(c,charfreq.get(c)+1);
            }
            else{
                charfreq.put(c,1);
            }
        }


        int maxcount=0;
        char maxoccurchar= ' ';
        for(Map.Entry<Character,Integer> entry:charfreq.entrySet())
        {
              if(entry.getValue()>maxcount)
              {
                  maxcount=entry.getValue();
                  maxoccurchar=entry.getKey();
              }
        }
        System.out.println(maxoccurchar + "  "+ maxcount);
    }
}
