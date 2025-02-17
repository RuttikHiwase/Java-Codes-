package GFG.Strings;

public class LeftMostNonReapeatingCharacter {
    public static void main(String[] args) {
        String str1 = "geekseeorgeeks";
        int CHAR = 256;
        int count[] = new int[CHAR];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }
        for (int j = 0; j < CHAR; j++) {
            if (count[str1.charAt(j)] == 1) {
                System.out.println(j);
                break;
            }
        }
    }}
