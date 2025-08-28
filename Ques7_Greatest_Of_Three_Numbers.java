public class Ques7_Greatest_Of_Three_Numbers {
    public static void main(String[] args) {

        int num1=56,num2=178,num3=99;
        int res,temp;
        temp=(num1 > num2)? num1 :num2 ;
        res = (num3 > temp) ? num3 : temp;
        System.out.println(res);

    }
}
