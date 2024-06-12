

    class Student{
       String name;
       int age;
       public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(String name,int age){
           this.name=name;
           this.age=age;
        }

    }
    public class OOPS2 {

    public static void main(String[] args) {
        Student s1= new Student("Girish",15);
         s1.printInfo();

    }
}
