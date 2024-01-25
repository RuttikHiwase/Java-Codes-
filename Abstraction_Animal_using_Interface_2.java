interface Animall{
    public void walk();


        }
        class Horse implements Animall{
               public void walk(){
                   System.out.println("Walks on four legs");
               }
        }


public class Abstraction_Animal_using_Interface_2 {
    public static void main(String[] args) {
     Horse hr=new Horse();
     hr.walk();
    }
}
