public class Recursion1 {
    public static void main(String[] args) {
        int n=1;
        printNm(n);

    }
    public static void printNm(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNm(n+1);
    }
}
