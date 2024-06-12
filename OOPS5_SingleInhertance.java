class Shape{
    public void area(){
        System.out.println("Calculating th Area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
       //
         System.out.println(1/2*l*h);
        //int cal=(1/2)*l*h;
       // System.out.println(cal);
    }
}
public class OOPS5_SingleInhertance {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.area();
        t.area(23,45);
    }
}
