package GFG.Strings.Extra;

public class PrintStringwithEvenLength {
    public static void main(String[] args) {
        //Java program to print Even length words in a String
        String str="This is a  coding practice";
        String words[]=str.split(" ");

        for(String word:words)
        {
            int lengthofword=word.length();
            if(lengthofword % 2 == 0)
            {
                System.out.println(word);
            }
        }
    }
}
