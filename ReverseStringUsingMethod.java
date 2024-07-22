package Strings;

public class ReverseStringUsingMethod {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        StringBuilder sttr=new StringBuilder(str);
        sttr.reverse();
        System.out.println(sttr);
    }
}
