package GFG.Strings.Extra;

public class RemoveAGivenCharacterFromString {
    public static void main(String[] args) {
        String str="hello this is the programming tutorial ";
        char ch='o';
        StringBuilder sb=new StringBuilder();

        for(char c:str.toCharArray())
        {
//            if(c == ' ')
//                continue;

            if(c != ch)
            {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
