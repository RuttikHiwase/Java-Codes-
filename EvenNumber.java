package Day3;

public class EvenNumber {
    private static void printEvenNumbers(){
        System.out.println("The Even Number till 50 are : ");
        int i=1;
        while(i <= 50){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        printEvenNumbers();
    }
}
