package GFG.Strings;

public class CheckIfStringsAreRotationOfEachOther {
    public static void main(String[] args) {
        String str1="ABABH";
        String str2="BABAU";

        if(str1.length() != str2.length())
            System.out.println("False");

            int  b=(str1+str1).indexOf(str2) ;
            if(b>=0)
                System.out.println("true");
            else
                System.out.println("false");
        }
}
