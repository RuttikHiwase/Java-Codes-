package Strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="he  ll  o   d";
        String newstr=str.replaceAll("\\s","");
        System.out.println(newstr);
    }
}
