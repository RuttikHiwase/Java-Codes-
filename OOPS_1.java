class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write method has been called");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}





public class OOPS_1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Red";
        pen1.type="Marker";
        pen1.write();
        pen1.printColor();
        Pen pen2=new Pen();
        pen2.color="Blue";
        pen2.type="sketchpen";
        pen2.write();
        pen2.printColor();
    }
}
