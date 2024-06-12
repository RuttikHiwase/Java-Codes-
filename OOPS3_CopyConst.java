class Student2 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student2(Student2 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student2() {

    }
}



public class OOPS3_CopyConst {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.name="jayant";
        s1.age=27;
        Student2 s2=new Student2(s1);
        s2.printInfo();



    }

    }

