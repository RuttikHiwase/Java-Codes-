package GFG.Strings;
//Note-IMP
//Subsequense is Non Contagious character
//SubString is Contagious Character




public class CheckSubSequence {
    public static void main(String[] args) {
   String str1="geksforgeks";
   String str2="eksgeks";
   int m=str1.length();
   int n=str2.length();
   int j=0;
   for(int i=0;i<m && j<n;i++)
        {
            if(str1.charAt(i) == str2.charAt(j))
                j++;
        }
   if (j==n)
       System.out.println("It is subsequence");
   else
       System.out.println("It is Not Sub sequense");
    }
}
