package Strings;

import java.util.HashMap;

public class StringPractice {
    public static void main(String[] args) {
     //Count the Frequency of Letters in String
        String str="The java coding challenge is Going on." ;
        HashMap<Character,Integer>   charfrequency=new HashMap<>();

        for(char c: str.toCharArray())
        {

            
            if(charfrequency.containsKey(c))
            {
                charfrequency.put(c, charfrequency.get(c)+1);
            }
            else
            {
                charfrequency.put(c,1);
            }
        }
        for(char c:charfrequency.keySet())
        {
            System.out.println(c + " "+ charfrequency.get(c));
        }


    }
}
