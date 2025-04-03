public class conditionalif {
    public static void main(String[] args) {
        //Greatest of three numbers using nested if else
        int a=600,b=451,c=8;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(" a is greater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println("b is greater");
            }
            else
            {
                System.out.println("c is greater");
            }
        }
    }
}
