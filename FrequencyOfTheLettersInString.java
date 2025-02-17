package GFG.Strings;

import java.util.HashMap;



import java.util.HashMap;

public class FrequencyOfTheLettersInString {
    public static void main(String[] args) {
        String str="This is the geeksforgeeks tutorials folder";
        HashMap<Character,Integer> charfrequency=new HashMap<Character, Integer>();

        // Iterating over each character in the string
        for(char x : str.toCharArray())
        {
            if (x == ' ') {// this corner case to ignores the ' ' black space count as frequency
                continue;
            }
            if(charfrequency.containsKey(x))
            {
                charfrequency.put(x,charfrequency.get(x) + 1);
            }
            else{
                charfrequency.put(x,1);
            }
        }
        for(char c:charfrequency.keySet())
        {
            System.out.println(c + " "+ charfrequency.get(c));
        }
    }
}
