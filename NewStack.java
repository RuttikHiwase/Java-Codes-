package Stack;

import java.util.Scanner;

public class NewStack {
    private static int arr[];
    private static int top;
    public NewStack(int size){
        arr=new int[size];
        top=-1;
    }

    public static boolean isFull(){
        return top==arr.length-1;
    }

    public static boolean isEmpty(){
        return top == -1;
    }
    public static void push(int data){
        if(isFull())
        {
            System.out.println("The Stack is over flow");
        }
        top++;
        arr[top]=data;
    }

    public static void pop(){
        if(isEmpty())
        {
            System.out.println("The stack is empty");
        }
        top--;
    }

    public int peek(){
        if(isEmpty())
        {
            System.out.println("The stack is empty");
        }
        return arr[top];
    }

    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
//------------------------------------------------------------------------------
    public static void main(String[] args) {
      NewStack S=new NewStack(10);
      int data;
      int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.push 2.pop 3.peek 5.exit 4.display");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the data");
                    data=sc.nextInt();
                    S.push(data);
                    System.out.println("The Data is Pushed");
                    break;

                case 2:
                    S.pop();
                    System.out.println("Element is Popped");
                    break;

                case 3:
                    data=S.peek();
                    System.out.println("The Peek Element is : "+ data);
                    break;

                case 4:
                    S.display();
                    break;

            }
        }while(choice != 0);
        sc.close();
    }
}
