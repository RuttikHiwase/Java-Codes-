package Day2;

/*
 Identify the Values of Uninitialized Variables
Scenario:
You are working on a program that handles different data types. Your manager has asked you to quickly
check the values of various variables, but you’re in a rush and forget to initialize them. As you go through
the code, you expect some values to show up, but Java has something else in mind. Your task is to fix the
issue and ensure the variables hold proper values.
Instructions:
1. Declare the following variables:
byte a;
short b;
int c;
long d;
float e;
double f;
char g;
boolean h;
2. Print out their values.
C-D
 */

public class PrblmStatement_DifferentDataTypes {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    void display(){
        System.out.println("The value of a : "+ a);
        System.out.println("The value of b : "+ b);
        System.out.println("The value of c : "+ c);
        System.out.println("The value of d : "+ d);
        System.out.println("The value of e : "+ e);
        System.out.println("The value of f : "+ f);
        System.out.println("The value of g : "+ h);
    }

    public static void main(String[] args) {
        PrblmStatement_DifferentDataTypes res=new PrblmStatement_DifferentDataTypes();
        res.display();
//  Note:
//  In Java, local variables must be initialized before use.
//  If you declare them inside a method (like main),
//  the compiler will throw an error if you try to use them without assigning a value.
//
//   However, instance variables (i.e., variables declared in a class but outside any method)
//   do get default values automatically
//
  }
}
