package Strings;

public class RemoveSpecialcharfromstring {
    public static void main(String[] args) {
        String str="hee#$%l*lo";
        String plain=str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(plain);
    }
}
