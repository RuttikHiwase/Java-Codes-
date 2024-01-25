
abstract class Animal{
    abstract void walk();
    
    public void eat(){
        System.out.println("Eats grass");//NOn Abstact method
    }
    Animal(){
        System.out.println("Base class Constructor get called");
    }

}
// point 2. when derived class object created then firstly base class constructor gets called then derieved class
// constructor gets called.
class Dog extends Animal{
    public void walk(){
        System.out.println("Walks on Four Legs");
    }
    Dog(){
        System.out.println("Dog class derived constuctor get called");
    }
}
class Chiken extends Animal{
    public void walk(){
        System.out.println("Walks on Two legs");
    }
}




public class Abstraction_Animal_1 {
    public static void main(String[] args) {
      Dog dg=new Dog();
      
       dg.walk();//Abstract method for derived class
        dg.eat();// non abstract method


    }
}
