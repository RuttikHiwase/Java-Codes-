public class BinaryStrings5 {
    public static String add_Binary(String x,String y){
        int  num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1 + num2 ;
        String bin =Integer.toBinaryString(sum);
        return bin;

    }
    public static void main(String[] args) {
        //Java Program to Add Two Binary Strings
         String x="11001",y="11011";
        System.out.println(add_Binary(x,y));
    }
}
