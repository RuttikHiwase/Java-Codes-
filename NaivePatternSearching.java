package GFG.Strings;

public class NaivePatternSearching {
    public static void main(String[] args) {
        String txt="ABCABCDABCDADABCDHHABCD";//o/p-3
        String pat="ABCD";

        //------------------------------------------------
           //case 2: txt- AHGDHFI
           //        pat - GDH
        //          O/P - 2
        //---------------------------------------------
        int pleng=pat.length();
        int tleng=txt.length();
        for(int i=0;i<=tleng-pleng;i++)
        {
            int j;
            for( j=0;j<pleng;j++) {
                if (pat.charAt(j) != txt.charAt(j + i))
                    break;
            }
                if(j == pleng)
                    System.out.print(i + " ");


        }
    }
}
