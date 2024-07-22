package Strings;

public class RemoveTheSpecialCharacter {
    public static void main(String[] args) {
        String str="ruttik@#@hiwase";
        //remove the special character from String;
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(cleanStr); // Output: ruttikhiwase

        String clean=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(clean);

    }
}
