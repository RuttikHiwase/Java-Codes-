import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int sum = subNum(a, b);
        int product = productNum(a, b);
        System.out.println(product);

    }

//    public static int subNum(int a, int b) {
//        int sum = a - b;
//        return sum;}

    public static int productNum(int a, int b) {

        return a * b;
}
}