class Student3{
    String name;
    int age;
    int roll_no;
    public void printInfo(String name,int age ,int roll_no)
    {
        System.out.println(name + " " + age + " " + roll_no);
    }
    public void printInfo(String name,int roll_no)
    {
        System.out.println(name + "  "+ roll_no);
    }
    public void printInfo(String name)
    {
        System.out.println(name);
    }

}



public class OOPS4_OVERLoading {
    public static void main(String[] args) {
        Student3 s=new Student3();
        s.printInfo("Kunal",34);
        s.printInfo("jayesh");
        s.printInfo("Mahesh",23,56);
    }
}
